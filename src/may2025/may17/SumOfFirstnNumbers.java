package may2025.may17;

public class SumOfFirstnNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNumber(5));
    }

    private static int sumOfNumber(int i) {
        if (i <= 1) {
            return i;
        } else {
            return i + sumOfNumber(--i);
        }
    }
}
