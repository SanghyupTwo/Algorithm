package baekjoon.ch4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_06_3052 {
    // 나머지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열의 길이가 10인 배열 생성
        int[] arr = new int[10];
        // 배열에 값 할당
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // set 선언
        Set set = new HashSet<>();
        // 모든 수를 42로 나눈 나머지 -> 중복 x -> set 사용
        for (int i = 0; i < 10; i++) {
            set.add(arr[i] % 42);
        }
        // 나머지 개수 출략
        System.out.println(set.size());
    }
}
