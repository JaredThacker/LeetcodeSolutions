package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < nums.length; i++){
                if(!freq.containsKey(nums[i])){
                    freq.put(nums[i], 1);
                } else {
                    freq.put(nums[i], freq.get(nums[i]) + 1);
                }
            }
            Integer distinct = 0;
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                Integer value = entry.getValue();
                if (value.equals(1)){
                    distinct = entry.getKey();
                }
            }

            return distinct;
    }
}
