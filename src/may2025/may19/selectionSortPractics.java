package may2025.may19;

public class selectionSortPractics {
    public static void main(String[] args) {
        int []a = {13, 2, 15, 7, 18, 2, 1};
        int n = a.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i; j <= n - 1; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            swapNumber(a, i, minIndex);
        }
        System.out.println(a);
    }

    private static void swapNumber(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
