package lecture20230504.chapter06.linkedlist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SimpleLinkedList<K> implements Iterable<K>, List<K> {
    private Element<K> first;
    private Element<K> last;
    private int size;

    public SimpleLinkedList() {
        size = 0;
    }

    public Element<K> getFirst() {
        return first;
    }

    public Element<K> getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public boolean add(K value) {
        // Element erzeugen
        // werte zuweisen, die notwendig sind
        Element<K> e = new Element<K>(value);

        // basis fall für leer
        // first == null
        if (first == null && last == null) {
            first = e;
            last = e;
        } else {
            // last verwenden
            last.setNext(e);
            e.setPrevious(last);
            last = e;
        }
        size ++;
        return true;
    }

    private Element<K> find(Object obj) {
        Element<K> cur = this.getFirst();
        while (cur != null) {
            if (cur.getValue().equals(obj)) {
                break; // wenn gefunden ist cur das objekt
            }
            cur = cur.getNext();
        }
        return cur; // falls nicht, dann null
    }

    public boolean remove(Object o) {
        // Objekt finden
        // -> while zum suchen
        // -> informationen auslesen und damit die struktur anpassen

        Element<K> find = this.find(o); // könnte null
        if (find == null) {
            return false;
        }

        Element<K> next = find.getNext(); // könnte null sein
        Element<K> previous = find.getPrevious(); // könnte null sein

        size--;
        if (first == find && last == find) {
            first = null;
            last = null;
            return true;
        }

        if (previous != null && next != null) {
            previous.setNext(next);
            next.setPrevious(previous);
        } else if (previous == null) {
            next.setPrevious(null);
            first = next;
        } else if (next == null) {
            previous.setNext(null);
            last = previous;
        }
        return true;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Object o) {
        return this.find(o) != null;
    }

    public Iterator<K> iterator() {
        return new SimpleLinkedListIterator<>(this);
    }

    public Object[] toArray() {
        Object[] ks = new Object[this.size()];
        Element<K> cur = this.getFirst();
        int i = 0;
        while (cur != null) {
            ks[i] = cur.getValue();
            cur = cur.getNext();
            i++;
        }
        return ks;
    }

    public <T> T[] toArray(T[] a) {
        T[] copyOf = Arrays.copyOf(a, size());
        Element<K> cur = this.getFirst();
        int i = 0;
        while (cur != null) {
            copyOf[i] = (T) cur.getValue();
            cur = cur.getNext();
            i++;
        }
        return copyOf;
    }

    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!this.contains(o)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends K> c) {
        boolean added = true;
        for(K element : c) {
            added = this.add(element) && added;
        }
        return added;
    }

    public boolean addAll(int index, Collection<? extends K> c) {
        boolean added = true;
        for(K element : c) {
            this.add(index ++ , element);
        }
        return added;
    }

    public boolean removeAll(Collection<?> c) {
        boolean removed = true;
        for(Object element : c) {
            removed = this.remove(element) && removed;
        }
        return removed;
    }

    public boolean retainAll(Collection<?> c) {
        boolean removed = true;
        for(Object element : c) {
            if(!this.contains(element)) {
                this.remove(element);
            }
        }
        return removed;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public K get(int index) {
        Element<K> find = this.find(index);
        return find != null ? find.getValue() : null;
    }

    public K set(int index, K element) {
        Element<K> old = this.find(index);
        this.add(index, element);
        this.remove(old);
        return old != null ? old.getValue() : null;
    }

    public void add(int index, K element) {
        Element<K> newElement = new Element<K>(element);
        Element<K> find = this.find(index); // gets previous
        if (find != null) {
            Element<K> previous = find.getPrevious();
            newElement.setNext(find);
            find.setPrevious(newElement);
            newElement.setPrevious(previous);
            if (previous != null) {
                previous.setNext(newElement);
            }
            if (first == find) {
                first = newElement;
            }
        } else if (last != null) {
            newElement.setPrevious(last);
            last.setNext(newElement);
            last = newElement;
        } else {
            first = newElement;
            last = newElement;
        }
    }

    public K remove(int index) {
        Element<K> find = this.find(index);
        if (find != null) {
            this.remove(find);
            return find.getValue();
        }
        return null;
    }

    public int indexOf(Object value) {
        Element<K> cur = first;
        int i = 0;
        while (cur != null) {
            if (cur.getValue().equals(value)) {
                return i;
            }
            cur = cur.getNext();
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object value) {
        Element<K> cur = last;
        int i = 0;
        while (cur != null) {
            if (cur.getValue().equals(value)) {
                return i;
            }
            cur = cur.getPrevious();
            i++;
        }
        return -1;
    }

    public ListIterator<K> listIterator() {
        throw new RuntimeException("Not implemented yet...");
    }

    public ListIterator<K> listIterator(int index) {
        throw new RuntimeException("Not implemented yet...");
    }

    public List<K> subList(int fromIndex, int toIndex) {
        Element<K> cur = this.find(fromIndex);
        Element<K> end = this.find(toIndex);
        SimpleLinkedList<K> list = new SimpleLinkedList<>();
        while (cur != null) {
            list.add(cur.getValue());
            if (cur == end) {
                break;
            }
            cur = cur.getNext();
        }
        return list;
    }
}
