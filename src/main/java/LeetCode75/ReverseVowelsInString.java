package LeetCode75;

import java.util.Set;

public class ReverseVowelsInString {
    public static String reverseVowels(String s) {
        char[] words = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = s.length()-1;
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');

        while(leftPointer < rightPointer) {
            while(leftPointer < rightPointer && !set.contains(words[leftPointer])) {
                leftPointer++;
            }
            while(leftPointer < rightPointer && !set.contains(words[rightPointer])) {
                rightPointer--;
            }
            swapVowels(words, leftPointer, rightPointer);
            leftPointer++;
            rightPointer--;
        }
        return new String(words);
    }

    private static void swapVowels(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
