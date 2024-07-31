package LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = 0;
        List<Boolean> bools = new ArrayList<>();

        for (int candy : candies){
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        for (int i =0; i<candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandies){
                bools.add(true);
            } else {
                bools.add(false);
            }
        }
        return bools;
    }
}
