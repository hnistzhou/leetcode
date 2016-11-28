import org.junit.Assert;
import org.junit.Test;
import org.zhou.leetcode.q442.Solution;
import org.zhou.leetcode.q442.Solution2;

import java.util.List;

/**
 * Created by yong.zhou on 2016/11/23.
 */
public class Q442Test {
    @Test
    public void testFindDuplicates() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        Solution solution = new Solution();
        List<Integer> result = solution.findDuplicates(nums);

        Assert.assertTrue(result.contains(2));
        Assert.assertTrue(result.contains(3));
    }

    @Test
    public void testFindDuplicates1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        Solution2 solution = new Solution2();
        List<Integer> result = solution.findDuplicates(nums);

        Assert.assertTrue(result.contains(2));
        Assert.assertTrue(result.contains(3));
    }
}
