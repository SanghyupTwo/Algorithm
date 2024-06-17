import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 참가자의 수
        int n = sc.nextInt();

        sc.nextLine();

        // s, m, l, xl, xxl, xxxl, xxxxl
//        String[] size = sc.nextLine().split(" ");
        int[] size = size = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        // 정수 티셔츠와 펜의 묶음
        int t = sc.nextInt(), p = sc.nextInt();

        int res = 0;

        // size 배열을 돌면서 몫구하고 나머지 있으면 + 1
        for (int i : size) {
//            res += (Integer.parseInt(i) / t) + (Integer.parseInt(i) % t > 0 ? 1 : 0);
            res += (i / t) + (i % t > 0 ? 1 : 0);
        }
        System.out.println(res);
        // n p 의 몫과 나머지 구하기
        System.out.printf("%d %d", n / p, n % p);
    }
}
