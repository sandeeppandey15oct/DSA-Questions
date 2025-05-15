package may2025.may14;

public class Recursion {
    public static void main(String[] args) {
        printNumber(10);
    }

    static void printNumber(int num) {
        if (num < 0) {
            return;
        }
        System.out.println(num--);
        printNumber(num);
    }
}
