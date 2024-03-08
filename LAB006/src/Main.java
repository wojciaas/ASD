import DoublyLinkedList.DoublyLinkedList;
import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
        list1.addToEnd(1);
        list1.addToEnd(2);
        list1.addToEnd(3);
        list1.addToEnd(4);
        list1.addToEnd(5);
        list1.print();
        list1.removeFromBegin();
        list1.print();
        list1.removeFromEnd();
        list1.print();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>();
        list2.addToEnd(6);
        list2.addToEnd(7);
        list2.addToEnd(8);
        list2.addToEnd(9);
        list2.addToEnd(10);
        list2.print();
        SinglyLinkedList<Integer> list3 = SinglyLinkedList.concatenate(list1.head, list2.head);
        list3.print();
        DoublyLinkedList<Integer> list4 = new DoublyLinkedList<Integer>();
        list4.addToEnd(11);
        list4.addToEnd(12);
        list4.addToEnd(13);
        list4.addToEnd(14);
        list4.addToEnd(15);
        list4.print();
        list4.removeFromBegin();
        list4.print();
        list4.removeFromEnd();
        list4.print();
        DoublyLinkedList<Integer> list5 = new DoublyLinkedList<Integer>();
        list5.addToEnd(16);
        list5.addToEnd(17);
        list5.addToEnd(18);
        list5.addToEnd(19);
        list5.addToEnd(20);
        list5.print();
        DoublyLinkedList<Integer> list6 = DoublyLinkedList.concatenate(list4.head, list5.head);
        list6.print();
    }
}
