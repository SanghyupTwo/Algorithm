package baekjoon.ch3;

import java.util.Scanner;

// 더하기 사이클
public class BOJ_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;
        int copy = num;

        while (true) {
            // 26 -> 6(2+6) -> 68 -> 8((1)4) ->  84
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            cnt++;
            if (num == copy) break;
        }
        System.out.println(cnt);
    }
}
