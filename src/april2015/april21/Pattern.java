package april2015.april21;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i > 0 && i < 4) {
                System.out.print("*");
                for (int j = 1; j <= 4; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if (i == 4) {
                System.out.println();
                for (int m = 0; m < 5; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
