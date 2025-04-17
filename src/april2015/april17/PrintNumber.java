package april2015.april17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));
        int s = Integer.parseInt(r.readLine());
        System.out.println("Entered number is ::"+s);
    }
}
