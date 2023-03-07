package baekjoon.ch7;

import java.util.Scanner;

/*
    if-else 문을 사용하니 가독성이 떨어진다.
    map을 이용해서 간단하게 풀어보자.
 */
// 너의 평점은
public class BOJ_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 전공과목별(학점 * 과목 평점)의 합
        double sum = 0;
        // 학점의 총합
        double total = 0;
        // 20줄 입력받기
        for (int i = 0; i < 20; i++) {
            // 과목명, 학점, 등급 입력받기
            String[] arr = sc.nextLine().split(" ");
            sc.close();
            // 전공과목별, 학점의 총합 구하기
            if (arr[2].equals("A+")) {
                sum += 4.5 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("A0")) {
                sum += 4.0 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("B+")) {
                sum += 3.5 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("B0")) {
                sum += 3.0 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("C+")) {
                sum += 2.5 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("C0")) {
                sum += 2.0 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("D+")) {
                sum += 1.5 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("D0")) {
                sum += Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            } else if (arr[2].equals("F")) {
                sum += 0 * Double.parseDouble(arr[1]);
                total += Double.parseDouble(arr[1]);
            }
        }
        System.out.printf("%.6f", sum / total);
    }
}