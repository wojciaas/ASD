package Stack;

import SinglyLinkedList.SinglyLinkedList.*;

public class StackList<T> {
    private Node<T> top;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T top() {
        if (top == null)
            throw new IllegalStateException("Styrta jest pusta");
        return top.data;
    }

    public T pop() {
        if (top == null)
            throw new IllegalStateException("Styrta jest pusta");
        T data = top.data;
        top = top.next;
        return data;
    }
}
