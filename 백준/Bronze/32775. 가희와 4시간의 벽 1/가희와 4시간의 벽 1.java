import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt(); // 고속철도
    int f = sc.nextInt(); // 항공

    System.out.println(s>f ? "flight" : "high speed rail");
  }
}