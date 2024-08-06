import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsInString {

    @Test
    public void test1(){
        String input = "hello";
        Assert.assertEquals("holle", LeetCode75.ReverseVowelsInString.reverseVowels(input));
    }

    @Test
    public void test2(){
        String input = "leetcode";
        Assert.assertEquals("leotcede", LeetCode75.ReverseVowelsInString.reverseVowels(input));
    }

    @Test
    public void test3(){
        String input = "race car";
        Assert.assertEquals("race car", LeetCode75.ReverseVowelsInString.reverseVowels(input));
    }
}
