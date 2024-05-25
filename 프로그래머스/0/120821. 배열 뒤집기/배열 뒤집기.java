class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        int cnt = 0;
        for (int i = num_list.length - 1; i >= 0; i--) {
            result[cnt] = num_list[i];
            cnt ++;
        }
        return result;
    }
}