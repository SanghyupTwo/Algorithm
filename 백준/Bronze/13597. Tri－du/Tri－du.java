import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        // a == b -> 세번째 카드는 a
        // a != b -> 세번째 카드는 두 수중에 큰 수로
        System.out.println(a == b ? a : a >= b ? a : b);
    }
}
