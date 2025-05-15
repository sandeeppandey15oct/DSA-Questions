package may2025.may15;

import java.util.HashSet;
import java.util.Set;

public class PrintAllDivisorsList {
    public static void main(String[] args) {
        int x = 12;
        Set<Integer> list = new HashSet<>();
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
