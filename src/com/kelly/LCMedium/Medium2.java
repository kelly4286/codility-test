package com.kelly.LCMedium;

import com.kelly.data.ListNode;

public class Medium2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        result.val = l1.val + l2.val;
        boolean overTen = false;
        if (result.val >= 10) {
            result.val -= 10;
            overTen = true;
        }
        if (l1.next != null || l2.next != null || overTen) {
            if (l1.next == null)
                l1.next = new ListNode(overTen? 1:0);
            else if(overTen)
                l1.next.val += 1;
            if (l2.next == null) l2.next = new ListNode(0);
            if (result.next == null) result.next = new ListNode(0);
            result.next = addTwoNumbers(l1.next, l2.next);
        }
        return result;
    }
}

