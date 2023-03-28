package baekjoon.ch6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_07_2908 {
    // 상수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        // StringBuilder()의 reverse()를 사용해 상수 뒤집기
        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.print(A > B ? A : B);

    }
}
