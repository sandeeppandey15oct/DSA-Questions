package april2015.april18.logic;

public class Pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= 5-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
