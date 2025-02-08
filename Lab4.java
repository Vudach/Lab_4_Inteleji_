import java.util.Arrays;

public class Lab4 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 6, 3, 7, 4, 0}; // Исходный массив
        shakerSortAscending(arr, 0, 3);
        shakerSortDescending(arr, 6, 9);
        System.out.println(Arrays.toString(arr));
    }
    public static void shakerSortAscending(int[] array, int left, int right) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            left++;
        } while (swapped);
    }
    public static void shakerSortDescending(int[] array, int left, int right) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = left; i < right; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] > array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            left++;
        } while (swapped);
    }
}

