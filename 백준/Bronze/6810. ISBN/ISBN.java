import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int res = 91;
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        res += a + b*3 + c;
        System.out.printf("The 1-3-sum is %d", res);
    }
}
