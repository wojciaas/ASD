package SinglyLinkedList;

public class SinglyLinkedList<T> {

    public static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node<T> head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addToBegin(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
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
        }
    }

    public void removeFromBegin() {
        if (head != null)
            head = head.next;
    }

    public void removeFromEnd() {
        if (head != null) {
            if (head.next == null)
                head = null;
            else {
                Node<T> secondLast = head;
                while (secondLast.next.next != null)
                    secondLast = secondLast.next;
                secondLast.next = null;
            }
        }
    }

    public void print() {
        Node<T> current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    //zadanie 4 dla listy jedno-kierunkowej
    public static <T> SinglyLinkedList<T> concatenate(Node<T> head1, Node<T> head2) {
        if (head1 == null) {
            SinglyLinkedList<T> list = new SinglyLinkedList<T>();
            list.head = head2;
            return list;
        } else {
            SinglyLinkedList<T> list = new SinglyLinkedList<T>();
            list.head = head1;
            Node<T> lastNode = list.head;
            while (lastNode.next != null)
                lastNode = lastNode.next;
            lastNode.next = head2;
            return list;
        }
    }
    //zadanie 5 dla listy jedno-kierunkowej
    public void insertAfter(Node<T> n, Node<T> subList) {
        Node<T> nodeAfter = n.next;
        Node<T> lastSubListNode = subList;
        while (lastSubListNode.next != null)
            lastSubListNode = lastSubListNode.next;
        n.next = subList;
        lastSubListNode.next = nodeAfter;
    }
}
