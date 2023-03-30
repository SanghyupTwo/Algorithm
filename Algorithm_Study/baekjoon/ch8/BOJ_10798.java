package baekjoon.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 세로읽기
public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                arr[i][j] = str[j];
            }
        }
        String result = "";
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != null) {
                    result += arr[i][j];
                }
            }
        }
        System.out.println(result);
    }
}
