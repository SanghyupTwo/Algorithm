package baekjoon.ch7;

import java.util.Scanner;

// 별 찍기 -7
public class BOJ_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2×N-1번째 줄까지 차례대로 별을 출력
        final int N = sc.nextInt();
        // 윗부분 출력
        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 0; j < N - i; j++)
                System.out.print(" ");
            // 별 찍기
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        // 아랫부분 출력
        for (int i = N - 1; i >= 0; i--) {
            // 공백 출력
            for (int j = 0; j < N - i; j++)
                System.out.print(" ");
            // 별 찍기
            for (int j = 0; j < i * 2 - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
