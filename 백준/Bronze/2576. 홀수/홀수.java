import java.util.Scanner;

// 홀수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }
        System.out.print(sum == 0 ? -1 : sum + "\n" + min);
    }
}
