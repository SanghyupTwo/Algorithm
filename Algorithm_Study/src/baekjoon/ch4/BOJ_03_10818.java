package baekjoon.ch4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_03_10818 {
    // 최소, 최대
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열의 개수 입력
        int n = sc.nextInt();
        // 배열의 길이가 n인 배열 생성
        int[] arr = new int[n];
        // 0번 인덱스부터 n-1번 인덱스까지 값 할당
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // 배열 정렬하기 -> min, max를 쉽게 찾을 수 있다.
        Arrays.sort(arr);
        // 0번째 인덱스는 최솟값, n-1인덱스는 최댓값
        System.out.println(arr[0] + " " + arr[n - 1]);
    }
}
