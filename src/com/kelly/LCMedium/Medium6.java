package com.kelly.LCMedium;

import java.util.ArrayList;
import java.util.List;

public class Medium6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<List<Character>> arrayList = new ArrayList<>();
        for (int i=0; i<numRows; i++) {
            arrayList.add(new ArrayList<>());
        }

        int level = 0;
        boolean direction = true;
        for (int i=0; i<s.length(); i++) {
            arrayList.get(level).add(s.charAt(i));

            if (direction)
                level ++;
            else {
                level --;
            }
            if (level >= numRows) {
                direction = ! direction;
                level = numRows -2;
            }
            else if (level < 0) {
                direction = ! direction;
                level = 1;
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i=0; i<numRows; i++) {
            for(int j=0; j<arrayList.get(i).size(); j++) {
                result.append(arrayList.get(i).get(j));
            }
        }
        return result.toString();
    }
}
