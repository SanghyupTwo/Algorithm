package baekjoon.ch3;

import java.util.Scanner;

// A+B -7
public class BOJ_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 1; i <= t; i++) { // 테스트 케이스만큼 반복
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d\n", i, a + b);
        }
        sc.close();
    }
}
