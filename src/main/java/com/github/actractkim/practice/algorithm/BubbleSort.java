package com.github.actractkim.practice.algorithm;

public class BubbleSort implements Sort{
    @Override
    public void sort(int[] input) {
        final int length = input.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j< length -i-1; j++){
                if(input[j] > input[j+1]){
                   swap(input, j, j+1);
                }
            }
        }
    }
}
