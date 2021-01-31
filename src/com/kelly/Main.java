package com.kelly;

import com.kelly.Codility.Molybdenum2019_1;
import com.kelly.Codility.Solution1;
import com.kelly.Codility.Solution2;
import com.kelly.KKStream.KKstream1;
import com.kelly.KKStream.KKstream2;
import com.kelly.KKStream.KKstream3;
import com.kelly.LCMedium.*;
import com.kelly.data.ListNode;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static void KKStream() {
        System.out.println(KKstream1.solution("") == 2);
        System.out.println(KKstream1.solution("aabab") == 3);
        System.out.println(KKstream1.solution("dog") == 8);
        System.out.println(KKstream1.solution("d   ") == 10);
        System.out.println(KKstream1.solution("aa") == 0);
        System.out.println(KKstream1.solution("baaaa") == -1);
        System.out.println(KKstream1.solution("aabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaabaab") == 2);

        System.out.println(KKstream2.solution("baaaaa") == 1);
        System.out.println(KKstream2.solution("baaabbaabbba") == 2);
        System.out.println(KKstream2.solution("baabab") == 0);

        System.out.println(KKstream3.solution(new int[]{ 13, 7, 2, 8, 3}) == 3);
        System.out.println(KKstream3.solution(new int[]{1,2,4,8}) == 1);
        System.out.println(KKstream3.solution(new int[]{16,16}) == 2);
        System.out.println(KKstream3.solution(new int[]{1}) == 1);
        System.out.println(KKstream3.solution(new int[]{7}) == 1);
        System.out.println(KKstream3.solution(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}) == 20);
    }
    public static void Medium12() {
        System.out.println(Medium12.intToRoman(3).equals("III"));
        System.out.println(Medium12.intToRoman(4).equals("IV"));
        System.out.println(Medium12.intToRoman(9).equals("IX"));
        System.out.println(Medium12.intToRoman(58).equals("LVIII"));
        System.out.println(Medium12.intToRoman(1994).equals("MCMXCIV"));
    }
    public static void Medium11() {
        System.out.println(Medium11.maxArea(new int[] {1,8,6,2,5,4,8,3,7}) == 49);
        System.out.println(Medium11.maxArea(new int[] {1,7}) == 1);
        System.out.println(Medium11.maxArea(new int[] {1,8,6}) == 6);
        System.out.println(Medium11.maxArea(new int[] {1,8,6,2,5,4,8}) == 40);
    }
    public static void Medium8() {
        System.out.println(Medium8.myAtoi("42") == 42);
        System.out.println(Medium8.myAtoi("   -42") == -42);
        System.out.println(Medium8.myAtoi("4193 with words") == 4193);
        System.out.println(Medium8.myAtoi("words and 987") == 0);
        System.out.println(Medium8.myAtoi("-91283472332") == -2147483648);
        System.out.println(Medium8.myAtoi("+42") == 42);
        System.out.println(Medium8.myAtoi("+") == 0);
        System.out.println(Medium8.myAtoi("-") == 0);
        System.out.println(Medium8.myAtoi("3.14159") == 3);
        System.out.println(Medium8.myAtoi("-9128347233200000000000") == -2147483648);
        System.out.println(Medium8.myAtoi("91283472332000000000") == 2147483647);
        System.out.println(Medium8.myAtoi("000000001283472332") == 1283472332);
        System.out.println(Medium8.myAtoi("    0000000000000   ") == 0);
        System.out.println(Medium8.myAtoi("-000000000000001") == -1);
    }
    public static void Medium6() {
        System.out.println(Medium6.convert("ABCDEFGHIJKL", 3).equals("AEIBDFHJLCGK"));
        System.out.println(Medium6.convert("PAYPALISHIRING", 3).equals("PAHNAPLSIIGYIR"));
        System.out.println(Medium6.convert("PAYPALISHIRING", 4).equals("PINALSIGYAHRPI"));
        System.out.println(Medium6.convert("AB", 1).equals("AB"));
    }
    public static void Medium5() {
        System.out.println(Medium5.longestPalindrome("babaj"));
        System.out.println(Medium5.longestPalindrome("cbbd"));
        System.out.println(Medium5.longestPalindrome("cccccc"));
        System.out.println(Medium5.longestPalindrome("a"));
        System.out.println(Medium5.longestPalindrome("aa"));
        System.out.println(Medium5.longestPalindrome("abcda"));
        System.out.println(Medium5.longestPalindrome("abcdefgg"));
        System.out.println(Medium5.longestPalindrome("abcdefgfejeisl"));
    }
    public static void Codility2020() {
        System.out.println(Solution1.getAnswer(new int[] { 3, 1, 4}) - 10);
        System.out.println(Solution1.getAnswer(new int[] {5, 3, 2, 4}) - 17);
        System.out.println(Solution1.getAnswer(new int[] {5, 3, 5, 2, 1}) - 19);
        System.out.println(Solution1.getAnswer(new int[] {7, 7, 3, 7, 7}) - 35);
        System.out.println(Solution1.getAnswer(new int[] {1, 1, 7, 6, 6, 6}) - 30);

        System.out.println(Solution2.getAnswer(new int[] { 3, 1, 4}) - 10);
        System.out.println(Solution2.getAnswer(new int[] {5, 3, 2, 4}) - 17);
        System.out.println(Solution2.getAnswer(new int[] {5, 3, 5, 2, 1}) - 19);
        System.out.println(Solution2.getAnswer(new int[] {7, 7, 3, 7, 7}) - 35);
        System.out.println(Solution2.getAnswer(new int[] {1, 1, 7, 6, 6, 6}) - 30);
    }
    public static void Molybdenum2019() {
        System.out.println(Arrays.equals(
            Molybdenum2019_1.solution(3, 5, new int[] { 2, 1, 3, 1, 2, 2, 3 }),
            new int[] { 2, 3 }));
        System.out.println(Arrays.equals(
            Molybdenum2019_1.solution(4, 2, new int[] { 1, 2, 2, 1, 2 }),
            new int[] { 2, 3 }));
        System.out.println(Arrays.equals(
            Molybdenum2019_1.solution(1, 1, new int[] { 1 }),
            new int[] { 2 }));
        System.out.println(Arrays.equals(
            Molybdenum2019_1.solution(1, 3, new int[] { 1, 2, 3 }),
            new int[] { 2, 3 }));
        System.out.println(Arrays.equals(
            Molybdenum2019_1.solution(2, 5, new int[] { 1, 1, 1, 1, 1 }),
            new int[] { 1 }));
    }
    public static void Medium2() {
        ListNode input1 = new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0)))))))));
        ListNode input2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        input1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        input2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode output = Medium2.addTwoNumbers(input1, input2);
        System.out.println(output.val);
        System.out.println(output.next.val);
        System.out.println(output.next.next.val);
        System.out.println(output.next.next.next.val);
    }
    public static void Medium3() {
        System.out.println(Medium3.lengthOfLongestSubstring("abcabcbb") - 3);
        System.out.println(Medium3.lengthOfLongestSubstring("bbbbb") - 1);
        System.out.println(Medium3.lengthOfLongestSubstring("pwwkew") - 3);
        System.out.println(Medium3.lengthOfLongestSubstring(""));
        System.out.println(Medium3.lengthOfLongestSubstring(" ") - 1);
        System.out.println(Medium3.lengthOfLongestSubstring("aab") - 2);
        System.out.println(Medium3.lengthOfLongestSubstring("dvdf") - 3);
        System.out.println(Medium3.lengthOfLongestSubstring("anviaj") - 5);
    }
}