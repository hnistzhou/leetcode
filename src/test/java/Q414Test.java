import org.junit.Assert;
import org.junit.Test;
import org.zhou.leetcode.q414.Solution;

/**
 * Created by yong.zhou on 2016/11/23.
 */
public class Q414Test {
    @Test
    public void testThirdMax() {
        int[] nums = {3, 2, 1};
        Solution solution = new Solution();
        int third = solution.thirdMax(nums);
        Assert.assertTrue(third == 1);
    }

    @Test
    public void testThirdMax1() {
        int[] nums = {1,2};
        Solution solution = new Solution();
        int third = solution.thirdMax(nums);
        Assert.assertTrue(third == 2);
    }

    @Test
    public void testThirdMax3() {
        int[] nums = { 3, 1,2, 2};
        Solution solution = new Solution();
        int third = solution.thirdMax(nums);
        Assert.assertTrue(third == 1);
    }
    @Test
    public void testThirdMax4() {
        int[] nums = {1,2,-2147483648};
        Solution solution = new Solution();
        int third = solution.thirdMax(nums);
        Assert.assertTrue(third == -2147483648);
    }

}
