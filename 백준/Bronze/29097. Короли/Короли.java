import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int[] li = new int[6];
        for (int i = 0; i < 6; i++) {
            li[i] = sc.nextInt();
        }

        // 각 캐릭터의 점수 계산
        int[] res = new int[3];
        for (int i = 0; i < 3; i++) {
            res[i] = li[i] * li[i + 3];
        }

        // 최대 점수 찾기
        int max = Math.max(res[0], Math.max(res[1], res[2]));

        // 캐릭터 이름 배열
        String[] names = { "Joffrey", "Robb", "Stannis" };

        // 최대 점수를 가진 캐릭터 출력
        for (int i = 0; i < 3; i++) {
            if (res[i] == max) {
                System.out.print(names[i] + " ");
            }
        }
    }
}