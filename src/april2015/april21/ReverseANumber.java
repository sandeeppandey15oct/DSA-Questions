package april2015.april21;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1234;
        int result = 0;
        while (n > 0) {
            int rem = n % 10;
            result = result * 10 + rem;
            n = n / 10;
        }
        System.out.println(result);
    }
}
