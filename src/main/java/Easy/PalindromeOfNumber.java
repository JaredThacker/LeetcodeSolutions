package Easy;

public class PalindromeOfNumber {
    public boolean isPalindrome(int x) {
        String reg = String.valueOf(x);
        StringBuilder sb = new StringBuilder(reg);
        return sb.reverse().toString().equals(reg);
    }
}
