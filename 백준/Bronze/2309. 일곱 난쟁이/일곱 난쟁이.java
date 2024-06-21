import java.util.Arrays;
import java.util.Scanner;

// 일곱 난쟁이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        // 임의의 수
        int a = 0;
        int b = 0;
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }
        for (int i : arr) {
            if (i == a || i == b) {
                continue;
            }
            System.out.println(i);
        }
    }
}
