package com.github.actractkim.practice.algorithm;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] input) {

        final int length = input.length;
        for(int i = 0; i < length; i++){
            int min = Integer.MAX_VALUE;
            int locate = i;
            for(int j = i; j < length; j++){
                if(input[j] < min){
                    min = input[j];
                    locate = j;
                }
            }
            if(i != locate){
                swap(input, i, locate);
            }
        }
    }


}
