package com.aditya;

import java.util.Arrays;

import java.lang.Math;

public class GoodPlayConverter {
    private final String initialNote;

    GoodPlayConverter(String note){
        this.initialNote = note;
    }

    public int calculateRemovalsCount() {
        int[] charFrequencies = Utils.getFrequencyList(initialNote);
        Arrays.sort(charFrequencies);
        int removalCount = 0,maxFreqAllowed=Integer.MAX_VALUE;
        for(int i=charFrequencies.length-1;i>=0;--i){
            if(charFrequencies[i]==0)
                break;
            if(charFrequencies[i]>maxFreqAllowed) {
                removalCount += charFrequencies[i] - Math.max(maxFreqAllowed,0);
                charFrequencies[i]=maxFreqAllowed;
            }
            maxFreqAllowed=Math.min(maxFreqAllowed,charFrequencies[i])-1;
        }
        return removalCount;
    }
}
