import java.util.Arrays;
import java.util.Scanner;

// 대표값2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.printf("%d%n%d", sum/5, arr[2]);
    }
}
