package com.kelly.Codility;

import com.kelly.Utility;
import com.kelly.data.MaxPoint;

import java.util.Arrays;

public class Solution1 {
    public static int getAnswer(int[] H) {
        MaxPoint maxPoint = Utility.getMaxValue(H);
        int maxValue = maxPoint.max;
        if (H[0] == maxValue && H[H.length-1] == maxValue) {
            return maxValue * H.length;
        }

        int minResult = maxValue * H.length;
        for (int i=1; i<H.length; i++) {
            int[] leftList = Arrays.copyOfRange(H, 0, i);
            int[] rightList = Arrays.copyOfRange(H, i, H.length);
            int leftMax = Utility.containsMax(maxPoint.index, 0, i) ? maxValue : Utility.getMax(leftList);
            int rightMax = Utility.containsMax(maxPoint.index, i, H.length) ? maxValue : Utility.getMax(rightList);;
            int totalCost = leftMax * i + rightMax * (H.length - i);
            if (totalCost < minResult) {
                minResult = totalCost;
            }
        }
        return minResult;
    }
}
