import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.nextLine());
        if (n.compareTo(BigInteger.valueOf(-32768)) >= 0 && n.compareTo(BigInteger.valueOf(32767)) <= 0) {
            System.out.println("short");
        } else if (n.compareTo(BigInteger.valueOf(-2147483648)) >= 0 && n.compareTo(BigInteger.valueOf(2147483647)) <= 0) {
            System.out.println("int");
        } else {
            System.out.println("long long");
        }
    }
}