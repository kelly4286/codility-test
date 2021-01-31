package com.kelly.LCMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Medium5 {
    public static String longestPalindrome(String s) {
        if(s.length() == 0) {
            return "";
        }
        if(s.length() == 1) {
            return s;
        }

        Map<Character, Integer> charOccurTimes = new HashMap<>();
        for (char c: s.toCharArray()) {
            if(charOccurTimes.containsKey(c)) {
                charOccurTimes.put(c, charOccurTimes.get(c)+1);
            }
            else {
                charOccurTimes.put(c, 1);
            }
        }

        if (charOccurTimes.size() == 1) {
            return s;
        }

        int max = 0;
        String result = "";
        boolean allSingle = true;
        for (Map.Entry<Character, Integer> e : charOccurTimes.entrySet()) {
            if (e.getValue() >= 2) {
                char[] p = getLongestPalindrome(s, e.getKey(), charOccurTimes);
                if (p.length > max) {
                    result = String.valueOf(p);
                    max = p.length;
                }
                allSingle = false;
            }
        }
        if (allSingle || max == 0) {
            return s.substring(0, 1);
        }
        return result;
    }

    public static char[] getLongestPalindrome(String s, char c, Map<Character, Integer> occurs) {
        int tmpIndex = -1;
        List<Integer> charIndex = new ArrayList<>();
        while (tmpIndex < s.length()){
            int i = s.indexOf(c, tmpIndex+1);
            if (i == -1) break;
            charIndex.add(i);
            tmpIndex = i;
        }

        List<int[]> cadidatePair = new ArrayList<>();
        for(int i=0; i<charIndex.size(); i++) {
            for(int j=0; j<charIndex.size(); j++) {
                if (i < j) {
                    cadidatePair.add(new int[]{i, j});
                }
            }
        }

        char[] tmpResult = new char[0];
        for (int[] pair : cadidatePair) {
            int start = pair[0];
            int end = pair[1];

            String subString = s.substring(charIndex.get(start), charIndex.get(end)+1);
            boolean isPalindrom = true;
            for (int i = 0; i < subString.length()/2; i++) {
                if (subString.charAt(i) != subString.charAt(subString.length() - 1 - i)) {
                    isPalindrom = false;
                    break;
                }
            }
            if (isPalindrom && subString.length() > tmpResult.length) {
                tmpResult = subString.toCharArray();
            }

        }
        return tmpResult;
    }
}
