package Easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j-i] + nums[j] == target) {
                    return new int[] {j, j - i};
                }
            }
        }
        return new int[2];
    }

    // HashMap<Integer, Integer> results = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++){
    //         int diff = target - nums[i];
    //         if (results.containsKey(diff)){
    //             return new int[]{results.get(diff), i};
    //         }
    //         results.put(nums[i],i);
    //     }
    //    return new int[]{};
    // }
}
