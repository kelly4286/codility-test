package com.kelly.LCMedium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Medium3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Integer, Character> map = new HashMap<>();
        Set<Character> mapExist = new HashSet<>();

        int result = 0;
        int beginIndex = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (mapExist.contains(c)) {
                if (map.size() > result)
                    result = map.size();

                while (map.get(beginIndex) != c) {
                    mapExist.remove(map.get(beginIndex));
                    map.remove(beginIndex);
                    beginIndex++;
                }
                mapExist.remove(map.get(beginIndex));
                map.remove(beginIndex);
                beginIndex++;

                map.put(i, s.charAt(i));
                mapExist.add(c);
            }
            else {
                map.put(i, c);
                mapExist.add(c);
            }
        }
        if (map.size() > result)
            result = map.size();
        return result;
    }
}
