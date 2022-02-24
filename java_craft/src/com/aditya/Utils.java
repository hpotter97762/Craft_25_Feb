package com.aditya;

import java.util.Arrays;

public class Utils {
    public static int[] getFrequencyList(String inputString) {
        int[] freqList = new int[26];
        Arrays.fill(freqList,0);
        for(int i=0;i<inputString.length();++i){
            freqList[inputString.charAt(i)-'a']+=1;
        }
        return freqList;
    }
}
