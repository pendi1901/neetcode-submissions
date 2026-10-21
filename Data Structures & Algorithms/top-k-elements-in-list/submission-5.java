class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i  = 0 ; i< nums.length ; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<ArrayList<Integer>>  arr = new ArrayList<>();
        for(int num: hm.keySet()){
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(hm.get(num));
            pair.add(num);
            arr.add(pair);
        }

        arr.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        int[] result= new int[k];
        int index = 0;
        while(index <k){
        // for(int i  = 0 ; i < arr.size() ; i++){
            
            ArrayList<Integer> pair = arr.remove(arr.size()-1);
            result[index] = pair.get(1);
            index++;

        }

        return result;
        

    }
}
