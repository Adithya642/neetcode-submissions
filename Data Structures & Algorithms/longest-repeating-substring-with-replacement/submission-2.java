/*
Brute Force - Find all the substrings and find the most ferquent character in those substring and replace the other k characters with frequent character the count will be frequency + k will be maximum length.
TC - O(n2)
Optimised approach - use 2 pointers and increase the window if length-maxFreq <=K if not move the window and increase count of right element the intuition here is 
we get a new maxLength only when we get a new max frequent element until that we can just slide the window and we don't need a new maxFreq in the window because we don't need to consider a window 
less than the max Length .
*/
class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0;
        int maxLength=0;
        int maxFreq=0;
        int cnt[]=new int[26];
        while(right<s.length()){
            cnt[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,cnt[s.charAt(right)-'A'] );
            int winLen=right-left+1;
            if(winLen-maxFreq<=k) {
                maxLength=Math.max(maxLength, winLen);
            }
            else{ 
                cnt[s.charAt(left)-'A']--;
                left++;

            }

            right++;
    }
    return maxLength;
}
}
