package april2015.april22;

import java.util.ArrayList;
import java.util.List;

public class HCFTest {
    public static void main(String[] args) {
        int a = 22;
        int b = 43;

        List<Integer> numbers = findTheFactors(a);
        System.out.println(numbers);

    }

    private static List<Integer> findTheFactors(int a) {
        List<Integer> integers = new ArrayList<>();

        while (a > 0) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    integers.add(i);
                    a = a / i;
                }

            }
        }

        return null;
    }
}
