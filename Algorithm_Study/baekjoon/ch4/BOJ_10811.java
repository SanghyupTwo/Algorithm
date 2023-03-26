package baekjoon.ch4;

import java.io.*;
import java.util.StringTokenizer;

// 바구니 뒤집기
public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        // 바구니 개수
        int n = Integer.parseInt(st.nextToken());
        // 바구니 순서 바꾸는 횟수
        int m = Integer.parseInt(st.nextToken());
//         바구니 배열
//        int[] beg = new int[n+1];
        StringBuilder sb = new StringBuilder();
        // 바구니 순서 초기값 넣어주기
        for(int i=1; i<n; i++){
//            beg[i] = i;
            sb.append(i);
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int begin = Integer.parseInt(st.nextToken())-1, end = Integer.parseInt(st.nextToken());
            sb.replace(begin, end, new StringBuilder(sb.substring(begin, end)).reverse().toString());
        }
        for(int i=0; i<sb.length(); i++){
            System.out.print(sb.toString().charAt(i)+" ");
        }
    }
}
