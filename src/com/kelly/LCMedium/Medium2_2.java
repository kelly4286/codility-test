package com.kelly.LCMedium;

import com.kelly.data.ListNode;

public class Medium2_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long n1 = getNumber(l1, 0);
        long n2 = getNumber(l2, 0);
        long sum = n1 + n2;
        return createNode(sum);
    }

    private static ListNode createNode(long n) {
        if (n < 10) return new ListNode((int) n);
        long value = n % 10L;
        return new ListNode(Integer.parseInt(String.valueOf(value)) , createNode(n / 10));
    }

    private static long getNumber(ListNode n, int d) {
        if (n.next == null)
            return (long) (n.val * Math.pow(10, d));
        return (long) ( n.val * Math.pow(10, d) + getNumber(n.next, d+1));
    }
}
