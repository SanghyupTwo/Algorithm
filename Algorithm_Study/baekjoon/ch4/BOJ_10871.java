package baekjoon.ch4;

import java.util.Scanner;

// X보다 작은 수
public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열의 개수 입력
        int n = sc.nextInt();
        // 배열의 길이가 n인 배열 생성
        int[] arr = new int[n];
        // 비교값
        int x = sc.nextInt();

        // 0번 인덱스부터 n-1번 인덱스까지 값 할당
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // x보다 작은 수 모두 출력
        for (int a : arr) {
            if (x > a) System.out.print(a + " ");
        }
    }
}
