package baekjoon.ch4;

import java.util.Scanner;

// OX퀴즈
public class BOJ_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {

            int cnt = 0;    // 연속횟수
            int sum = 0;    // 누적 합산

            for (int j = 0; j < arr[i].length(); j++) {
                // 문자열에 'O' 있는지 확인
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
