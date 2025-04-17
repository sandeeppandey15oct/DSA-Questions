package april2015.april17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader r = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Please provide mark to find the grade");
            int s = -1;
            try {
                s = Integer.parseInt(r.readLine());
            } catch (Exception e) {
                System.err.println("Please Enter valid number");
            }
            if (s > 100) {
                System.err.println("Please provide valid input");
            } else if (s >= 90 && s <= 100) {
                System.err.println("Grade A");
            } else if (s >= 70) {
                System.err.println("Grade B");
            } else if (s >= 50) {
                System.err.println("Grade C");
            } else if (s >= 35) {
                System.err.println("Grade D");
            } else if (s >= 0) {
                System.err.println("Fail");
            }
        }
    }
}
