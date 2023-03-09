package baekjoon.ch2;

import java.util.Scanner;

// 오븐 시계
public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 현재 시각 : 시
        int b = sc.nextInt(); // 현재 시각 : 분
        int c = sc.nextInt(); // 요리하는데 필요한 시간
        sc.close();

        if (b + c >= 60) {
            a += (b + c) / 60;
            b = (b + c) % 60;
            if (a >= 24) {
                a -= 24;
            }
            System.out.println(a + " " + b);

        } else {
            System.out.println(a + " " + (b + c));
        }
    }
}
