package baekjoon.ch3;

import java.util.Scanner;

// 영수증
public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 영수증에 적힌 총 금액
        int n = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
        int compareValues = 0; // 비교값

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // 각 물건의 가격
            int b = sc.nextInt(); // 각 물건의 개수
            compareValues += a * b; // 비교값에 물건 값 대입하기
        }
        sc.close();
        // 총 금액이랑 비교값이 같으면 Yes 출력, 다르면 No 출력
        System.out.println(x == compareValues ? "Yes" : "No");
    }
}
