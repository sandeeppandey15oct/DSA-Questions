package may2025.may19;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {13, 15, 17, 18, 22};
        int n = a.length;
        boolean isSorted = true;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    System.out.println("Array is not sorted");
                    swapNumber(a, j, j + 1);
                }
            }
            if (isSorted) {
                System.out.println("Array is  sorted .. breaking the loop");
                break;
            }
        }
        System.out.println(a);
    }

    private static void swapNumber(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
