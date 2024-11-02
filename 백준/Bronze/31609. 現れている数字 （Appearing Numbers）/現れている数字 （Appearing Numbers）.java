import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .sorted().distinct().toArray();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}