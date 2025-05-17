package may2025.may17;

public class RecursionOneToN {
    public static void main(String[] args) {
        printNumber(10, 1);
    }

    static void printNumber(int target, int count) {
        if (count > target) {
            return;
        }
        System.out.println(count);
        printNumber(target, ++count);
    }
}