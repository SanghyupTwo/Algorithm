package baekjoon.ch5;

import java.util.Scanner;

public class BOJ_01_15596 {
    // 정수 N개의 합
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3}));
    }

    public static long sum(int[] arr) {
        // 배열의 합 변수 선언
        long sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
}
