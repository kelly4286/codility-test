package com.kelly.LCMedium;

import static java.lang.Math.min;

public class Medium11 {
    public static int maxArea(int[] height) {
        int maxResult = 0;
        for (int i=0; i<height.length-1; i++) {
            for (int j=1; j<height.length; j++) {
                if (i < j) {
                    int result = min(height[i], height[j]) * (j -i);
                    if (result > maxResult) {
                        maxResult = result;
                    }
                }
            }
        }
        return maxResult;
    }
}
