package LeetCode75;

public class ReverseVowelsInString {
    public static String reverseVowels(String s) {
        String[] split = s.split("");
        int leftPoint = 0;
        int rightPoint = split.length - 1;
        for (int i = leftPoint; i < split.length; i++){
            if ("AEIOUaeiou".contains(split[i]) || "AEIOUaeiou".contains(split[rightPoint])){
                for (int j = rightPoint; j > 0; j--){
                    if ("AEIOUaeiou".contains(split[j]) && "AEIOUaeiou".contains(split[i])){
                        String tmp = split[j];
                        split[j] = split[i];
                        split[i] = tmp;
                        break;
                    } else {
                        for (int k = 0; k < split.length; k++){
                            if ("AEIOUaeiou".contains(split[k]) && "AEIOUaeiou".contains(split[j])) {
                                String tmp = split[j];
                                split[j] = split[k];
                                split[k] = tmp;
                                break;
                            }
                        }
                    }
                }

            }
            leftPoint++;
            rightPoint--;
        }
        String result = String.join("", split);
        return result;
    }
}
