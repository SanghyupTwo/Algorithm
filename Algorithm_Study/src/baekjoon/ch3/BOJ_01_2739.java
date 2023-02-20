package baekjoon.ch3;

import java.util.Scanner;

public class BOJ_01_2739 {
    // 구구단
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
