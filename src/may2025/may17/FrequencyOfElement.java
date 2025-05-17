package may2025.may17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int []a={2,2,4,5,3,2,1,8,9,7,8,5,7,4,2,1,0,1,2};
        Map<Integer,Integer> integerIntegerMap = new HashMap<>();
        Arrays.stream(a).forEach(i -> {
            if (integerIntegerMap.get(i) == null) {
                integerIntegerMap.put(i, 1);
            } else {
                integerIntegerMap.compute(i, (k, val) -> val + 1);
            }
        });
        System.out.println(integerIntegerMap);
    }
}
