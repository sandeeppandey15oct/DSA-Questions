package may2025.may23;

import static may2025.may19.SelectionSort.swapNumber;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {6,5,4,3,2,1};
        int n = a.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
        System.out.println(a);
    }
}
