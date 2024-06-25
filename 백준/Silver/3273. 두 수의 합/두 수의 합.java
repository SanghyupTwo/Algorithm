import java.util.Arrays;
import java.util.Scanner;

// 두 수의 합
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int x = sc.nextInt();

        boolean[] num = new boolean[2000001];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            // 13 > arr[i] && num[] && num[13-arr[i]]
            if (x - arr[i] > 0 && num[x - arr[i]]) ans++;
            num[arr[i]] = true;
        }

        System.out.println(ans);
    }
}
