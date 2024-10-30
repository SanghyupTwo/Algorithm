import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (Arrays.stream(arr).anyMatch(j -> j == 7)) {
                cnt++;
            }
        }
        System.out.println(cnt == 3 ? 777 : 0);
    }
}