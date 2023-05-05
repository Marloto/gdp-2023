package lecture20230504.chapter06.linkedlist;

public class SimpleLinkedListExamples {


    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.add(42);
        list.add(1);
        list.add(21);

        list.remove(1);
        list.remove(42);
        list.remove(21);

        // for()
        // solange weiter bis beim last
        Element<Integer> cur = list.getFirst();
        while (cur != null) {
            System.out.println(cur.getValue());
            cur = cur.getNext();
        }
        cur = list.getLast();
        while (cur != null) {
            System.out.println(cur.getValue());
            cur = cur.getPrevious();
        }

        SimpleLinkedList<String> list2 = new SimpleLinkedList<>();

        list2.add("Hello");
        list2.add("World");

        Element<String> cur2 = list2.getFirst();
        while (cur2 != null) {
            System.out.println(cur2.getValue());
            cur2 = cur2.getNext();
        }

        String[] array = list2.toArray(new String[0]);

        for (String el : list2) {
            System.out.println(el);
        }
    }
}
