import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int min = 500;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += arr[i];
            if (min >= arr[i]) min = arr[i];
        }
        System.out.println(sum - min + 1);
    }
}