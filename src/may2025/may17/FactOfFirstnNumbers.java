package may2025.may17;

public class FactOfFirstnNumbers {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int i) {
        if (i <= 1) {
            return i;
        } else {
            return i * factorial(--i);
        }
    }
}
