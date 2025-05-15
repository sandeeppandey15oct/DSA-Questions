package may2025.may15;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int sum = 0;
        int x = 153;
        int n = findTheNumOfDigit(x);
        int num = x;
        while (x > 0) {
            int d = x % 10;
            sum = sum + (int) Math.pow(d, n);
            x = x / 10;
        }
        if (sum == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }

    }

    private static int findTheNumOfDigit(int x) {
        int val = x;
        int c = 0;
        while (val > 0) {
            c++;
            val = val / 10;

        }
        return c;
    }
}
