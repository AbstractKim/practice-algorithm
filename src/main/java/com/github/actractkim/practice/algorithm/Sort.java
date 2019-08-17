package com.github.actractkim.practice.algorithm;// narrow range


public interface Sort {
    void sort(int[] input);

    default void swap(int[] input, int p, int n){
        int temp = input[p];
        input[p] = input[n];
        input[n] = temp;
    }
}
