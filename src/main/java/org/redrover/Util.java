package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class Util {
    static String hi = "Hi";

    public static int sum(Integer first, int second) {
        int sum = first + second;
        return sum;
}
    public static int printSum(int first, int second) {
        int s = sum(first, second);

        System.out.println(s);
        return s;
    }

    public static String abb(String text, int leght) {
        return StringUtils.abbreviate(text, leght);
    }
}
