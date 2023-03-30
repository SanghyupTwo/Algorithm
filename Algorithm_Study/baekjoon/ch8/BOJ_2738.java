package baekjoon.ch8;

import java.io.*;
import java.util.StringTokenizer;

// 행렬 덧셈
public class BOJ_2738 {
    public static void main(String[] args) throws IOException {
        // 행렬의 크기 n, m
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 행렬 A,B 생성
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        // 행렬 A에 원소 넣기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 행렬 B에 원소 넣기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 행렬 A,B 더하기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
