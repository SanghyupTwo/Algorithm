class Solution {
    public int[] solution(int[] num_list) {
        int[] result = {0, 0};
        
        for (int n : num_list) {
            if (n%2==0){
                result[0] += 1;
            }else{
                result[1] += 1;
            }
        }
        return result;
    }
}