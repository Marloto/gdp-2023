package lecture20230504.chapter06.linkedlist;

public class Element<T> {
    private T value;
    private Element<T> previous;
    private Element<T> next;

    public Element() {
    }

    public Element(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Element<T> getPrevious() {
        return previous;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setPrevious(Element<T> previous) {
        this.previous = previous;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }
}
