package org.zhou.leetcode.q2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yong.zhou on 2016/11/22.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = toArray(l1);
        List<Integer> list2 = toArray(l2);
        List<Integer> merge = merge(list1, list2);
        return arrayToListNode(merge);
    }

    List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> merge = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        int tmp = 0;
        while (i1 < list1.size() && i2 < list2.size()) {
            int v1 = list1.get(i1);
            int v2 = list2.get(i2);
            int v3 = v1 + v2 + tmp;
            tmp = 0;
            if (v3 >= 10) {
                tmp = v3 / 10;
                v3 = v3 % 10;
            }
            merge.add(v3);
            i1++;
            i2++;
            rest(tmp, i1, i2, list1, list2, merge);
            rest(tmp, i2, i1, list2, list1, merge);
        }
        return merge;
    }

    ListNode arrayToListNode(List<Integer> merge) {
        ListNode result = new ListNode(merge.get(0));
        ListNode last = null;
        if (merge.size() <= 1) {
            return result;
        }
        for (int i = 1; i < merge.size(); i++) {
            ListNode n = new ListNode(merge.get(i));
            if (result.next == null) {
                result.next = n;
            } else {
                last.next = n;
            }
            last = n;
        }
        return result;
    }

    void rest(int tmp, int i, int j, List<Integer> li, List<Integer> lj, List<Integer> merge) {
        if (i < li.size()) {
            return;
        }
        while (j < lj.size()) {
            int v3 = tmp + lj.get(j);
            tmp = 0;
            if (v3 >= 10) {
                tmp = v3 / 10;
                v3 = v3 % 10;
            }
            merge.add(v3);
            j++;
        }
        if (tmp != 0) {
            merge.add(tmp);
        }
    }

    List<Integer> toArray(ListNode listNode) {
        List<Integer> result = new ArrayList<>();
        while (listNode != null) {
            result.add(listNode.val);
            listNode = listNode.next;
        }
        return result;
    }

}