package baekjoon.ch1;

import java.util.Scanner;

// 1988년생인 내가 태국에서는 2541년생?!
public class BOJ_18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        System.out.println(year - 543);
    }
}
