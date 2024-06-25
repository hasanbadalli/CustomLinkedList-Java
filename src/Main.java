import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(6);
        list.remove(1);


        System.out.println("Hello world!");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(2);
        myLinkedList.add(5);
        myLinkedList.add(2);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.remove(0);
        System.out.println(myLinkedList.get(0));
        myLinkedList.print();
        myLinkedList.clear();
        myLinkedList.print();
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(9);
        myLinkedList.print();
    }
}