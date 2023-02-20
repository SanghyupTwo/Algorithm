package baekjoon.ch4;

import java.util.Scanner;

public class BOJ_05_5597 {
    // 과제 안 내신 분...?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1번부터 30번까지 학생
        int[] student = new int[31];
        // 과제 제출한 28명 입력받기
        for (int i = 1; i < 29; i++) {
            int success = sc.nextInt();
            student[success] = 1;
        }
        // 과제 제출 안한 사람 찾기
        for (int i = 1; i < student.length; i++) {
            if (student[i] != 1)
                System.out.println(i);
        }
        sc.close();
    }
}
