package baekjoon.ch2;

import java.util.Scanner;

public class BOJ_07_2480 {
    // 주사위 세 개
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        // 같은 눈 3개가 나오는 경우
        if ((a == b) && (b == c)) {
            System.out.println(10000 + a * 1000);
            // 같은 눈 2개가 나오는 경우
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
            // 전부 다 다른 눈이 나오는 경우
        } else {
            int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
            System.out.println(max * 100);
        }
    }
}
