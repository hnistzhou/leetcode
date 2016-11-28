import org.junit.Assert;
import org.junit.Test;
import org.zhou.leetcode.q2.ListNode;
import org.zhou.leetcode.q2.Solution;

/**
 * Created by yong.zhou on 2016/11/22.
 */
public class Q2Test {
    @Test
    public void testAddTwoNumbers() {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l11.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l21.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l11, l21);

        Assert.assertTrue(result.val == 7);
        Assert.assertTrue(result.next.val == 0);
        Assert.assertTrue(result.next.next.val == 8);
    }

    @Test
    public void testAddTwoNumbers1() {
        ListNode l11 = new ListNode(5);

        ListNode l21 = new ListNode(5);
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l11, l21);

        Assert.assertTrue(result.val == 0);
        Assert.assertTrue(result.next.val == 1);
    }

    @Test
    public void testAddTwoNumbers2() {
        ListNode l11 = new ListNode(9);

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(9);
        l21.next = l22;
        ListNode l23 = new ListNode(9);
        l22.next = l23;
        ListNode l24 = new ListNode(9);
        l23.next = l24;
        ListNode l25 = new ListNode(9);
        l24.next = l25;
        ListNode l26 = new ListNode(9);
        l25.next = l26;
        ListNode l27 = new ListNode(9);
        l26.next = l27;
        ListNode l28 = new ListNode(9);
        l27.next = l28;
        ListNode l29 = new ListNode(9);
        l28.next = l29;
        ListNode l210 = new ListNode(9);
        l29.next = l210;

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l11, l21);

        Assert.assertTrue(result.val == 0);
        Assert.assertTrue(result.next.val == 0);
        Assert.assertTrue(result.next.next.val == 0);
        Assert.assertTrue(result.next.next.next.val == 0);
        Assert.assertTrue(result.next.next.next.next.val == 0);

    }


    @Test
    public void testAddTwoNumbers3() {
        ListNode l11 = new ListNode(9);

        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(9);
        l21.next = l22;


        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l21, l11);

        Assert.assertTrue(result.val == 8);
        Assert.assertTrue(result.next.val == 0);
        Assert.assertTrue(result.next.next.val == 1);

    }
}
