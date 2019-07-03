package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.5, "11111");
        labels.put(2.8, "1111");
        labels.put(2.4, "111");
        labels.put(2.3, "11");
        labels.put(2.2, "11");
    }
    

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
