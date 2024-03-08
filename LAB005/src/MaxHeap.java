import java.util.Arrays;

public class MaxHeap {

    private int size;

    MaxHeap(int[] arr) {
        size = arr.length;
        construct(arr, arr.length);
    }

    public void construct(int[] arr, int n) {
        for (int i = n/2-1; i >= 0; i--)
            heapify(arr, n, i);
        System.out.println(Arrays.toString(arr));
    }

    private void heapify(int[] arr, int n, int i) {
        int leftChild = 2*i+1, rightChild = 2*i+2, parent = i;
        if (leftChild < n && arr[leftChild] > arr[parent])
            parent = leftChild;

        if (rightChild < n && arr[rightChild] > arr[parent])
            parent = rightChild;

        if (parent != i) {
            swap(arr, i, parent);
            heapify(arr, n, parent);
        }
    }

    public void delMax(int[] arr) {
        if (size == 0)
            throw new IllegalStateException("Heap is empty");
        swap(arr, 0, --size);
        heapify(arr, size, 0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void sortMax(int[] arr) {
        MaxHeap h = new MaxHeap(arr);
        while (!h.isEmpty())
            h.delMax(arr);
    }

    private void swap(int[] arr, int src, int dest) {
        int tmp = arr[src];
        arr[src] = arr[dest];
        arr[dest] = tmp;
    }

    public static int[] mergeHeaps(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] merged = new int[n + m];
        System.arraycopy(a, 0, merged, 0, n);
        System.arraycopy(b, 0, merged, n, m);
        MaxHeap h = new MaxHeap(merged);
        return merged;
    }

    public static void main(String[] args) {
        int[] arr = {48, 93, 69, 54, 72, 18, 30, 6, 51, 2, 25, 31, 84};
        MaxHeap.sortMax(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(MaxHeap.mergeHeaps(new int[]{2, 5, 1, 9, 12}, new int[]{3, 7, 4, 10})));
    }
}
