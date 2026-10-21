class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, List<String>> hm1 = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s  = new String(c);
            hm1.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);
        }

        for(List<String> l : hm1.values()){
            answer.add(l);
        }


        return answer;
    }
}
