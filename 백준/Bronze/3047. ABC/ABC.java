import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted().toArray();

        String str = sc.nextLine();
        for (char c : str.toCharArray()) {
            if (c == 'A') {
                System.out.print(arr[0]+" ");
            } else if (c == 'B') {
                System.out.print(arr[1]+" ");
            } else {
                System.out.print(arr[2]+" ");
            }
        }
    }
}