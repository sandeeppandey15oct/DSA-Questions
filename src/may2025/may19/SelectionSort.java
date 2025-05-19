package may2025.may19;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []a = {13, 2, 18, 21, 69, 42};
        int n = a.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = -1;
            for (int j = i + 1; j <= n - 1; j++) {
                if (a[j] < a[i]) {
                    minIndex = j;
                }

            }
            if (minIndex >= 0)
                swapNumber(a, i, minIndex);
        }
        printMyArray(a);
    }

    private static void printMyArray(int[] a) {
        Arrays.stream(a).forEach(System.out::println);
    }

    private static void swapNumber(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
