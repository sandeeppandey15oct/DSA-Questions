package april2025.april17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchClass {
    public static void main(String[] args) {
        while (true) {
            BufferedReader r = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Please provide day number between 1 to 7:");
            int s = -1;
            try {
                s = Integer.parseInt(r.readLine());
            } catch (Exception e) {
                System.err.println("Please Enter valid number between 1 to 7");
            }

            switch (s) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
