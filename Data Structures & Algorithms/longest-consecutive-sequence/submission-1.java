// Every element is either a part of a sequence or extending a sequence.
// If the previous element contains then its not the start of a sequence why do we need a start of sequence is we can only go in one order and find the count 
// Search for starting element and progress from that element increasing the count , if the next element does not contain store the count in maxCount element 
// This way we can get TC of O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int cnt=1;
            if(!hs.contains(curr-1)){
                while(hs.contains(curr+1)){
                    cnt++;
                    curr++;
                }
            }
            maxCount=Math.max(cnt,maxCount);
        }
        return maxCount;
    }
}
