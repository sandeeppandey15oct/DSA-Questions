package may2025.may22;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "aa");
        map.put("B", "bb");
        map.put("C", "cc");
        map.put("D", "dd");

        map.entrySet()
                .stream()
                .map(me -> me.getKey() + "---" + me.getValue())
                .forEach(System.out::println);

    }
}
