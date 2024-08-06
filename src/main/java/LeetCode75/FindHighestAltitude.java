package LeetCode75;

public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int netGain = 0;
        for (int i = 0; i < gain.length; i++){
            netGain += gain[i];
            if (netGain > highest) {
                highest = netGain;
            }
        }
        return highest;
    }
}
