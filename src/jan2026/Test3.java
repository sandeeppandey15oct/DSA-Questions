package jan2026;

import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        Predicate<Integer> p = (a)->a%2==0;
        System.out.println(p.test(112));
        List<String> list = List.of("a","c");
        list.forEach(x-> System.out.println(x));
    }
}
