package com.company;

public class Main {

    public static int[] merge(int[] arr1, int[] arr2){
        int L1 = arr1.length;
        int L2 = arr2.length;
        int[] result = new int[L1 + L2];

        int i = 0; //First Array
        int j = 0; //Second Array
        int k = 0; //Merged Array

        while((i < L1) && (j < L2)) {
            if(arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else result[k++] = arr2[j++];
        }
        while (i < L1){
            result[k++] = arr1[i++];
        }
        while (j < L2) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};
        int[] result = merge(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
