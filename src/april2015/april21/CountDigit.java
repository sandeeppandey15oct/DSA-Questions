package april2015.april21;

public class CountDigit {
    public static void main(String[] args) {
        int n = 100012;
        if (n < 0) {
            n = n * -1;
        }
        int counter = 0;
        while (n > 0) {
            counter++;
            n = n / 10;
        }
        System.out.println(counter);
    }
}
