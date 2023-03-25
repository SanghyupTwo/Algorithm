package baekjoon.ch3;

import java.util.Scanner;

// 코딩은 체육
public class BOJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 바이트 정수까지 저장
        int N =sc.nextInt()/4;
        // 바이트
        String b = "";
        for (int i = 0; i < N; i++) {
            b += "Long ";
        }
        System.out.println(b+"int");
    }
}
