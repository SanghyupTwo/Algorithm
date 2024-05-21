class Solution {
    public int solution(int[] array, int n) {
        int cnt = 0;
        
        for (int a : array){
            if (a == n){
                cnt ++;
            }
        }
        return cnt;
    }
}