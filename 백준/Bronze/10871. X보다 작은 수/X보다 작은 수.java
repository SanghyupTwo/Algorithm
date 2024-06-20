import java.util.Arrays;
import java.util.Scanner;

// X보다 작은 수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int cnt = 0;
        for (int i : arr) {
            if (i < x) {
                cnt++;
            }
        }
        int[] res = new int[cnt];
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < x) res[tmp++] = arr[i];
        }

        for (int r : res) {
            System.out.print(r + " ");
        }
    }
}