import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // a + b - c
        System.out.println(a + b - c);
        // a랑 b는 문자열로 더한다음 c 빼기
        System.out.println(Integer.parseInt("" + a + b) - c);
    }
}