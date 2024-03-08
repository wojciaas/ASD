package DoublyLinkedList;

import SinglyLinkedList.SinglyLinkedList;

public class DoublyLinkedList<T> {

    public static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Node<T> head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void addToBegin(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    public void addToEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null)
            head = newNode;
        else {
            Node<T> last = head;
            while (last.next != null)
                last = last.next;
            last.next = newNode;
            newNode.prev = last;
        }
    }

    public void removeFromBegin() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void removeFromEnd() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node<T> secondLast = head;
                while (secondLast.next.next != null) {
                    secondLast = secondLast.next;
                }
                secondLast.next = null;
            }
        }
    }

    public void print() {
        DoublyLinkedList.Node<T> current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    //zadanie 4 dla listy dwu-kierunkowej
    public static <T> DoublyLinkedList<T> concatenate(Node<T> head1, Node<T> head2) {
        if (head1 == null) {
            DoublyLinkedList<T> list = new DoublyLinkedList<T>();
            list.head = head2;
            return list;
        } else {
            DoublyLinkedList<T> list = new DoublyLinkedList<T>();
            list.head = head1;
            Node<T> lastNode = list.head;
            while (lastNode.next != null)
                lastNode = lastNode.next;
            if (head2 != null) {
                lastNode.next = head2;
                head2.prev = lastNode;
            }
            return list;
        }
    }
    //zadanie 5 dla listy dwu-kierunkowej
    public void insertAfter(Node<T> n, Node<T> subList) {
        Node<T> nodeAfter = n.next;
        Node<T> lastSubListNode = subList;
        while (lastSubListNode.next != null)
            lastSubListNode = lastSubListNode.next;
        n.next = subList;
        subList.prev = n;
        lastSubListNode.next = nodeAfter;
        if (nodeAfter != null)
            nodeAfter.prev = lastSubListNode;
    }

    public static <T> DoublyLinkedList <T> merge(Node<T> head1, Node<T> head2) {
        DoublyLinkedList<T> result = new DoublyLinkedList<T>();
        
        return result;
    }
}
