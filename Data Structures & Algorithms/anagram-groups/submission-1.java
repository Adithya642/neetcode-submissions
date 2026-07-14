class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            int cnt[]=new int[26];
            for(int i=0;i<s.length();i++){
                cnt[s.charAt(i)-'a']++;
            }
            String key = Arrays.toString(cnt);
            if(hm.containsKey(key)) {
                hm.get(key).add(s);
            }
            else{
            List<String> val=new ArrayList<>();
            val.add(s);
             hm.put(key,val);
            }
        }
        List<List<String>> result=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:hm.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
