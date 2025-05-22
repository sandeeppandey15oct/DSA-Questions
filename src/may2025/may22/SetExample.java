package may2025.may22;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        System.out.println(stringSet);

        List<String> list = new ArrayList<>();
        /*list.add("A");
        list.add("B");
        list.add("C");*/
        System.out.println(list.getFirst());
    }
}
