import java.util.Arrays;

public class HeapSort {
    public static <T extends Comparable<? super T>> void heapsort(T[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements from heap in sorted order
        for (int i = n - 1; i >= 0; i--) {
            // Move root to the end
            swap(arr, 0, i);
            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    private static <T extends Comparable<? super T>> void heapify(T[] arr, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && arr[left].compareTo(arr[largest]) > 0)
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right].compareTo(arr[largest]) > 0)
            largest = right;

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
