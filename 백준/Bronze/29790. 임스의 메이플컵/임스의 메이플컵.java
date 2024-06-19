import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), u = sc.nextInt(), l = sc.nextInt();

        System.out.println(n >= 1000 ? u >= 8000 || l >= 260 ? "Very Good" : "Good" : "Bad");

        sc.close();
    }
}