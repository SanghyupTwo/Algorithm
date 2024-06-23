import java.util.Arrays;
import java.util.Scanner;

// 핸드폰 요금
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 통화의 개수
        int n = sc.nextInt();
        sc.nextLine();
        // 통화 시간 n개
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 영식은 30초마다 10원
        int y = 0;
        // 민식은 60초마다 15원
        int m = 0;

        for (int i : arr) {
            y += (i / 30) + 1;
            m += (i / 60) + 1;
        }
        y *= 10;
        m *= 15;
        System.out.println(y == m ? "Y M " + y : y < m ? "Y " + y : "M " + m);
    }
}
