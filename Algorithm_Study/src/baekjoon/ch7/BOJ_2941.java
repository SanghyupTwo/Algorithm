package baekjoon.ch7;

import java.util.Scanner;

// 크로아티아 알파벳
public class BOJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String st = sc.nextLine();
        sc.close();
        // str[]문자열 배열을 훑으면서 변환할 문자가 있는지 검사한다. 때문에 배열크기만큼 반복.
        for (int i = 0; i < str.length; i++) {
            // st.contains(str[i]) 배열에 있는 원소가 사용자가 입력한 st문자열에 있는지 검사하는 함수.
            if (st.contains(str[i]))
                // 특수문자로 변환하는 이유는 알파벳으로 변환했다간 다음 검사때 중복카운트가 되는 경우를 방지, 다른 특수문자도 가능
                st = st.replace(str[i], "!");
        }
        System.out.println(st.length());
    }
}
