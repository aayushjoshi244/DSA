import java.util.Arrays;
import java.util.Random;

public class MergeVsQuickSort {

    /* ===================== MERGE SORT ===================== */

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        mergeSortRec(arr, 0, arr.length - 1);
    }

    private static void mergeSortRec(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSortRec(arr, left, mid);
        mergeSortRec(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    /* ===================== QUICK SORT ===================== */

    public static void quickSort(int[] arr) {
        quickSortRec(arr, 0, arr.length - 1);
    }

    private static void quickSortRec(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSortRec(arr, low, p - 1);
            quickSortRec(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* ===================== TESTING ===================== */

    public static void main(String[] args) {
        int[] sizes = {10, 20, 100};
        Random rand = new Random();

        for (int n : sizes) {
            int[] original = new int[n];
            for (int i = 0; i < n; i++) {
                original[i] = rand.nextInt(1000);
            }

            int[] arrMerge = Arrays.copyOf(original, n);
            int[] arrQuick = Arrays.copyOf(original, n);

            long start, end;

            start = System.nanoTime();
            mergeSort(arrMerge);
            end = System.nanoTime();
            long mergeTime = end - start;

            start = System.nanoTime();
            quickSort(arrQuick);
            end = System.nanoTime();
            long quickTime = end - start;

            System.out.println("n = " + n);
            System.out.println("Merge Sort Time : " + mergeTime + " ns");
            System.out.println("Quick Sort Time : " + quickTime + " ns");
            System.out.println("--------------------------------");
        }
    }
}
