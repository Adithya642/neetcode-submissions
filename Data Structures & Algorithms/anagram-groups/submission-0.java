class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            
            int c1[]=new int[26];
            for(char c:strs[i].toCharArray()){
                c1[c-'a']++;
            }
           StringBuilder keyBuilder = new StringBuilder();
            for (int num : c1) {
                keyBuilder.append(num).append('#'); 
            }
            String key = keyBuilder.toString();

            hm.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
