package lecture20230504.chapter06.linkedlist;

import java.util.Iterator;

public class SimpleLinkedListIterator<T> implements Iterator<T> {
    
    private SimpleLinkedList<T> list;
    private Element<T> cur;


    public SimpleLinkedListIterator(SimpleLinkedList<T> list) {
        this.list = list;
        cur = this.list.getFirst();
    }

    public boolean hasNext() {
        return cur != null;
    }

    public T next() {
        T value = cur.getValue();
        cur = cur.getNext();
        return value;
    }

    
    public static void main(String[] args) {
//        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
//        list.add(42);
//        list.add(1);
//        list.add(21);
//        SimpleLinkedListIterator<Integer> it = list.iterator(); // manuelle Verwendung
//        while(it.hasNext()) {
//            Integer next = it.next();
//            System.out.println(next);
//        }
    }
}
