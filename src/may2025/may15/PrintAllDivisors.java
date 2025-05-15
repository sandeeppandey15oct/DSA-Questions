package may2025.may15;

import java.util.HashSet;
import java.util.Set;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int x = 12;
        Set<Integer> list = new HashSet<>();
        while (x > 1) {
            for (int i = 2; i <= x; i++) {
                if (x % i == 0) {
                    list.add(i);
                    x = x / i;
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
