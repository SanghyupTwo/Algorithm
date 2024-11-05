import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().replace("l", "L").replace("I", "i");

        System.out.println(s);
    }
}