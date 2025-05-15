package may2025.may15;

public class CheckPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        int n = 117;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime");
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        }

    }
}
