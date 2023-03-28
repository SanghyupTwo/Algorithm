package baekjoon.ch6;

import java.util.Scanner;

public class BOJ_02_11720 {
    // 숫자의 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 숫자의 개수 입력
        int n = sc.nextInt();
        // 숫자 입력
        String[] num = sc.next().split("");
        // 합
        int sum = 0;
        // 반복문으로 총합구하기
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(num[i]);
        }
        System.out.println(sum);
    }
}
