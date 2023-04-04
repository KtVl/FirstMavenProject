package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class Util {
    static String hi = "Hi";

    public static int sum(Integer first, int second) {
        int sum = first + second;
        return sum;
}
    public static void printSum(int first, int second) {
        int s = sum(first, (Integer) second);

        System.out.println(hi + "sum= " + s);
    }

    public static String abb(String text, int leght) {
        return StringUtils.abbreviate(text, leght);
    }
}
