class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1=new int[26];
        int[] t1=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            s1[c-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            t1[c-'a']++;
        }
        boolean anag=true;
        for(int i=0;i<26;i++) {
            if (s1[i]!=t1[i]) {anag=false; break;}
        }
        if(anag) return true;
        else return false;
    }
}
