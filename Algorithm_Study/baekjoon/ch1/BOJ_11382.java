package baekjoon.ch1;

import java.io.*;
import java.util.StringTokenizer;

// 꼬마 정민
public class BOJ_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(a+b+c));

        br.close();
        bw.flush();
        bw.close();
    }
}
