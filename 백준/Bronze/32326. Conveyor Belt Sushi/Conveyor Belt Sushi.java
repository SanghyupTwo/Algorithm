import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // r, g, b 접시마다 3, 4, 5
        int r = sc.nextInt(), g = sc.nextInt(), b = sc.nextInt();

        System.out.println((r * 3) + (g * 4) + (b * 5));
    }
}