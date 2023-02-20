package baekjoon.ch4;

import java.util.Scanner;

public class BOJ_04_2562 {
    // 최댓값
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열의 길이가 9인 배열 생성
        int[] arr = new int[9];
        // 0번 인덱스부터 8번 인덱스까지 값 할당
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // 변수 선언, 할당
        int count = 0;
        int max = 0;
        int index = 0;
        // arr.length 만큼 반복
        for (int value : arr) {
            count++;
            if (value > max) {
                max = value;
                index = count;
            }
        }
        // 최댓값, 최댓값 위치 출력
        System.out.print(max + " " + index);
    }
}
