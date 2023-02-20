package baekjoon.ch3;

import java.util.Scanner;

public class BOJ_10_10952 {
    // A+B -5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {                   // 무한반복
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) break; // 입력에 0 두 개가 들어오면 종료
            System.out.println(a + b);   // 합 출력
        }
        sc.close();
    }
}
