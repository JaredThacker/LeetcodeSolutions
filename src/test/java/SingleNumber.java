import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SingleNumber {

    @Test
    public void test1(){

        int[] expected = {2,2,1};
        int distinct = Easy.SingleNumber.singleNumber(expected);

        Assert.assertEquals(1, distinct);
    }
}
