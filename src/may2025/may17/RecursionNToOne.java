package may2025.may17;

public class RecursionNToOne {
    public static void main(String[] args) {
        printNumber( 10);
    }

    static void printNumber(int count) {
        if (count < 1) {
            return;
        }
        System.out.println(count);
        printNumber(--count);
    }
}