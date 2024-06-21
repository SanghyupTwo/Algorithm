import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        // 각 숫자의 개수를 저장할 배열
        int[] num = new int[10];

        // 숫자 개수 세기
        for (char c : n.toCharArray()) {
            num[c - '0']++;
        }

        // 6과 9를 하나의 세트로 처리
        int maxSets = 0;
        int sum69 = num[6] + num[9];
        num[6] = sum69 / 2 + sum69 % 2;
        num[9] = sum69 / 2 + sum69 % 2;

        // 가장 많이 필요한 세트의 개수 찾기
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxSets) {
                maxSets = num[i];
            }
        }

        System.out.println(maxSets);
    }
}
