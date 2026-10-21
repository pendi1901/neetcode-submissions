class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            int sol = target - nums[i];
            if(hm1.containsKey(sol)){
                return new int[]{hm1.get(sol), i};
            }

            hm1.put(nums[i], i);
        }

        return new int[] {};
    }
}
