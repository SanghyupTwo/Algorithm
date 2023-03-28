package baekjoon.ch6;

import java.util.Scanner;

public class BOJ_04_2675 {
    // 문자열 반복
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 t
        int t = sc.nextInt();
        // t만큼 반복문
        for (int i = 0; i < t; i++) {
            // 반복 횟수 r
            int r = sc.nextInt();
            // 문자를 한 단어씩 나누어서 배열에 저장
            String[] str = sc.next().split("");
            // 반복된 문자 p
            String p = "";
            // str 문자열 길이만큼 반복
            for (int j = 0; j < str.length; j++) {
                // r번 반복해서 p에 값 넣어주기
                for (int k = 0; k < r; k++) {
                    p += str[j];
                }
            }
            System.out.println(p);
        }
    }
}
