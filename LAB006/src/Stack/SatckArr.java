package Stack;

public class SatckArr<T> {
    private int topIndex;
    private T[] stack;

    public SatckArr(int size) {
        topIndex = -1;
        stack = (T[]) new Object[size];
    }

    public void push(T data) {
        if (topIndex == stack.length - 1)
            throw new IllegalStateException("Styrta jest pełna");
        stack[++topIndex] = data;
    }

    public T top() {
        if (topIndex == -1)
            throw new IllegalStateException("Styrta jest pusta");
        return stack[topIndex];
    }

    public T pop() {
        if (topIndex == -1)
            throw new IllegalStateException("Styrta jest pusta");
        return stack[topIndex--];
    }
}
