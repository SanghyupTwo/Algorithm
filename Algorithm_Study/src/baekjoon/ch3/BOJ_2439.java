package baekjoon.ch3;

import java.util.Scanner;

public class BOJ_2439 {
    // 별 찍기 -2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {         // n번째 줄까지 차례대로 별을 출력
            for (int j = n - i; j > 0; j--) {  // 공백 입력하기
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {     // i번째 줄에 *를 몇 개 출력할건지
                System.out.print("*");
            }
            System.out.println();             // 줄 구분
        }
    }
}
