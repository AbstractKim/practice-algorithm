package com.github.actractkim.practice.algorithm;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] input) {
        for(int i=0; i < input.length - 1; i++){
            for(int j = i+1; j > 0 ; j--){
                final int insertNum = input[j];
                final int comparedNum = input[j-1];
                if(insertNum < comparedNum)
                    swap(input, j, j-1);
                else
                    break;
            }
        }
    }
}
