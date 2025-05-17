package may2025.may17;

public class ReverseArrayUsingRecurssion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(a);
        reverseArray(a, 0, a.length-1);
        System.out.println("ReverseArrayUsingRecurssion.main--> Reversing");
        printArray(a);
    }

    private static void reverseArray(int[] a, int start, int end) {
        if(start<end){
            swap(a, start, end);
            reverseArray(a, start+1, end-1);
        }

    }

    private static void swap(int[] a, int start, int end) {
        int temp= a[start];
        a[start]=a[end];
        a[end]=temp;
    }

    private static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
