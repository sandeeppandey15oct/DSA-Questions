package april2025.april21;

public class CheckPalindrom {
    public static void main(String[] args) {
        int n = 1221;
        int result = getResult(n);
        System.out.println(result == n ? "Palindrom" : "Not Palindrom");
    }

    private static int getResult(int n) {
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            result = result * 10 + rem;
            n = n / 10;
        }
        return result;
    }
}
