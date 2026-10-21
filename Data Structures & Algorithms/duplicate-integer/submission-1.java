class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm1 = new HashSet<>();
        for(int i  = 0 ; i < nums.length ; i++){
            if(hm1.contains(nums[i])){
                return true;
            }
            else{
                hm1.add(nums[i]);
            }
        }

        return false;
    }
}