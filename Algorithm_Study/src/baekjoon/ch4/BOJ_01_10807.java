package baekjoon.ch4;

import java.util.Scanner;

public class BOJ_01_10807 {
    // 구구단
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열의 개수 입력
        int n = sc.nextInt();
        // 배열의 길이가 n인 배열 생성
        int[] arr = new int[n];
        // v값의 개수 카운트
        int cnt = 0;

        // 0번 인덱스부터 n-1번 인덱스까지 값 할당
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 찾으려는 v값 입력받기
        int v = sc.nextInt();
        for (int a : arr) {
            if (a == v) cnt++; // 배열의 원소가 v랑 같으면 cnt = cnt+ 1
        }
        sc.close();
        // v값의 개수 카운트 출력
        System.out.println(cnt);
    }
}
