class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int answer = 0;
        for(int i = 0 ;i < nums.length ; i++){
            if(nums[i]==1){
                maxCount++;

            }
            else if(nums[i] == 0){
                maxCount= 0 ;
            }

            answer = Math.max(maxCount, answer);
        }

        return answer;
        
    }
}