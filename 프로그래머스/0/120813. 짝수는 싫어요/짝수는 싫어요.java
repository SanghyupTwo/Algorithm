import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) {
            list.add(i);
        }

        // ArrayList<Integer>를 int[]로 변환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}