package Easy;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length * 2;
        int[] dub = new int[len];

        for (int i = 0; i < nums.length; i++){
            dub[i] = nums[i];
        }

        int halfPoint = nums.length;

        for (int j = 0; j < nums.length; j++){
            dub[halfPoint] = nums[j];
            halfPoint++;
        }
        return dub;
    }
}
