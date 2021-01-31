package com.kelly.Codility;

import java.util.*;

public class Molybdenum2019_1 {
    public static int[] solution(int K, int M, int[] A) {
        Set<Integer> result = new HashSet<>();

        for (int i=0; i<=A.length-K; i++) {
            Map<Integer, Integer> occurTimes = new HashMap<>();
            for(int j=0; j<A.length; j++) {
                if (j >= i && j < i+K) {
                    if (occurTimes.containsKey(A[j]+1)) {
                        occurTimes.put(A[j]+1, occurTimes.get(A[j]+1)+1);
                    }
                    else {
                        occurTimes.put(A[j]+1, 1);
                    }
                }
                else {
                    if (occurTimes.containsKey(A[j])) {
                        occurTimes.put(A[j], occurTimes.get(A[j])+1);
                    }
                    else {
                        occurTimes.put(A[j], 1);
                    }
                }
            }

            for (Integer v : occurTimes.keySet()) {
                if (occurTimes.get(v) > A.length/2)
                    result.add(v);
            }
        }
        return result.stream().sorted().mapToInt(i->i).toArray();
    }
}
