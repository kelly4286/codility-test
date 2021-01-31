package com.kelly.KKStream;

import java.util.ArrayList;
import java.util.List;

public class KKstream1 {
    public static int solution(String S) {
        if (S.contains("aaa")) {
            return -1;
        }

        List<Count> aCounts = new ArrayList<>();
        int partNum = 0;
        if (! S.startsWith("a")) {
            partNum = 1;
            aCounts.add(new Count(0));
        }
        for(char c : S.toCharArray()) {
            if (c == 'a') {
                if (aCounts.size() < partNum+1) {
                    aCounts.add(new Count(0));
                }
                aCounts.get(partNum).num = aCounts.get(partNum).num + 1;
            }
            else {
                partNum++;
                aCounts.add(new Count(0));
            }
        }

        int result = 0;
        for (Count c : aCounts) {
            if (c.num < 2) {
                result += 2 - c.num;
            }
        }
        return result;
    }
}
class Count {
    int num;
    Count(int num) { this.num = num; }
}

