package baekjoon.ch7;

import java.util.Scanner;

// 팰드롬인지 확인하기
public class BOJ_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자열 입력
        String str1 = sc.next();
        sc.close();
        // 문자열 뒤집기
        String str2 = new StringBuilder(str1).reverse().toString();
        // 삼항 연산자 사용해서 같으면 1 출력, 다르면 0 출력
        System.out.println(str1.equals(str2) ? 1 : 0);
    }
}
