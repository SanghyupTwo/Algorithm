package baekjoon.ch4;

import java.util.Arrays;
import java.util.Scanner;

// 평균
public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 과목의 개수 N 입력
        int n = sc.nextInt();
        // 현재 성적 배열 선언
        double[] arr = new double[n];
        double average = 0;
        // 배열에 현재 성적 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        // 배열 정렬
        Arrays.sort(arr);
        // 최대값 할당하기
        int m = (int) arr[n - 1];
        // 모든 점수를 점수/m*100으로 고치기
        // 실수형의 배열 필요
        for (int i = 0; i < n; i++) {
            average += (arr[i] / m) * 100 / n;
        }
        // 새로운 평균 출력
        System.out.println(average);
    }
}
