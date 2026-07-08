package kr.ac.kopo.day04;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayMain05 {

    public static void main(String[] args) {

//        int[][] arr = new int[3][4];
        int[][] arr = {
                {1, 2, 3, 4},
                {10, 20},
                {11, 22, 33, 44, 55, 66}
        };

        System.out.println(arr);
        System.out.println("arr.length : " + arr.length);
        System.out.println("arr[1].length : " + arr[1].length);

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println("arr[0] : " + arr[0]);
//        System.out.println("arr[1] : " + arr[1]);
//        System.out.println("arr[2] : " + arr[2]);

    }

} 
