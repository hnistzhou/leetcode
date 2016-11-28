package org.zhou.leetcode.q442;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yong.zhou on 2016/11/23.
 */
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!set.contains(n)) {
                set.add(n);
            } else {
                result.add(n);
            }
        }
        return result;
    }
}
