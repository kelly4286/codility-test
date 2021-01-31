package com.kelly.LCMedium;

public class Medium8 {
    public static int myAtoi(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        str = str.trim();
        if (str.isEmpty() || ! Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+' )
            return 0;

        StringBuilder result = new StringBuilder();
        boolean getFirst = false;
        boolean isNegative = false;
        for (char c : str.toCharArray()) {
            if (! getFirst && ! Character.isSpaceChar(c)
            && ( c == '-' || c == '+' || Character.isDigit(c))) {
                if (c == '+') {
                    getFirst = true;
                    continue;
                }
                else if (c == '-') {
                    getFirst = true;
                    isNegative = true;
                    continue;
                }
                result.append(c);
                getFirst = true;
                continue;
            }
            if (getFirst && ! Character.isDigit(c)) {
                break;
            }
            if (getFirst && Character.isDigit(c)) {
                result.append(c);
            }
        }

        String resultStr = result.toString();
        while (resultStr.startsWith("0")) {
            resultStr = resultStr.substring(1);
        }
        if (resultStr.length() == 0){
            return 0;
        }
        if (! isNegative && (resultStr.length() > 10 || Long.parseLong(resultStr) >= Integer.MAX_VALUE)) {
            return Integer.MAX_VALUE;
        }
        else if (isNegative && (resultStr.length() > 10 || - Long.parseLong(resultStr) <= Integer.MIN_VALUE)) {
            return Integer.MIN_VALUE;
        }

        return isNegative? -Integer.parseInt(resultStr) : Integer.parseInt(resultStr);
    }
}
