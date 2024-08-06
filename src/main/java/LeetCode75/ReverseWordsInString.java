package LeetCode75;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String[] newSentence = new String[words.length];
        int i = 0;
        for (int j = words.length - 1; j >= 0; j--){
            newSentence[i] = words[j];
            i++;
        }
        String sent = String.join(" ", newSentence);
        return sent.replaceAll("\\s+", " ").trim();
    }
}
