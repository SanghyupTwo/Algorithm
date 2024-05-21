import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(m%k==0 ? "Yes" : "No");
        sc.close();
        
    }
}