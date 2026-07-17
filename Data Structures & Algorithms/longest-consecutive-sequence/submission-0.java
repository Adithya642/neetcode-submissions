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
            while(hs.contains(curr+1)){
                cnt++;
                curr++;
            }
            maxCount=Math.max(cnt,maxCount);
        }
        return maxCount;
    }
}
