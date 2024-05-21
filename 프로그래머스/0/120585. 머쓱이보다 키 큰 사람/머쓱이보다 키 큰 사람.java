class Solution {
    public int solution(int[] array, int height) {
        int result = 0;
        
        for (int a : array){
            if (a > height) {
                result++; 
            }
        }
        return result;
    }
}