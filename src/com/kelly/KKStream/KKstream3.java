package com.kelly.KKStream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KKstream3 {
    public static int solution(int[] A) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int a : A) {
            int index = 0;
            while(a > 0) {
                countMap.putIfAbsent(index, 0);
                countMap.put(index, countMap.get(index) + (a & 1));
                a = a >> 1;
                index ++;
            }
        }
        return Collections.max(countMap.values());
    }
}
