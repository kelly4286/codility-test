package com.kelly.KKStream;

import java.util.ArrayList;
import java.util.List;

public class KKstream2 {
    public static int solution(String S) {
        List<Count> aCounts = new ArrayList<>();
        int partNum = 0;
        char currentChar = S.charAt(0);
        for(char c : S.toCharArray()) {
            if (c == currentChar) {
                if (aCounts.size() < partNum+1) {
                    aCounts.add(new Count(0));
                }
                aCounts.get(partNum).num = aCounts.get(partNum).num + 1;
            }
            else {
                currentChar = c;
                partNum++;
                aCounts.add(new Count(1));
            }
        }

        int result = 0;
        for (Count c : aCounts) {
            if (c.num >= 3) {
                result += c.num / 3;
            }
        }

        return result;
    }
}
