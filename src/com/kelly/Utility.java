package com.kelly;

import com.kelly.data.MaxPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {
    public static boolean containsMax(List<Integer> list, int start, int end) {
        for (int i : list) {
            if (i > start && i < end)
                return true;
        }
        return false;
    }

    public static int getMax(int[] H) {
        return Arrays.stream(H).max().getAsInt();
    }

    public static MaxPoint getMaxValue(int[] H) {
        MaxPoint max = new MaxPoint();
        max.index = new ArrayList<>();
        max.max = getMax(H);
        for(int i=0; i<H.length; i++) {
            if (H[i] == max.max) {
                max.index.add(i);
            }
        }
        return max;
    }
}
