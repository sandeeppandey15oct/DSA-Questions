package april2015.april21;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(" * ");
                }
            }
            if (i > 0 && i < 4) {
                for (int j = 0; j < 5; j++) {
                    if (j == 0) {
                        System.out.print(" * ");
                    }
                    if (j > 0 && j < 4) {
                        System.out.print(" ");
                    }
                    if (j == 4) {
                        System.out.print(" * ");
                    }
                }
            }
            if (i == 4) {
                for (int m = 0; m < 5; m++) {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }


    }
}
