package kr.ac.kopo.day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain04 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        int[] arr2 = arr; // shallow copy(얕은복사)
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, 0);
//        for(int i = 0; i < arr.length; i++) {
//            arr2[i] = arr[i];


        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("arr2 : "+ Arrays.toString(arr2));


        //-------------------------------------------


        String[] strArr = {"봄", "여름", "가을", "겨울"};
        String[] strArr2 = new String[strArr.length];

        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);

        strArr2[2] = "Fall";

        System.out.println("strArr : " + Arrays.toString(strArr));
        System.out.println("strArr2 : " + Arrays.toString(strArr2));

    }

}
