class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int result[]={0,0};
        for(int i=0;i<nums.length;i++){
            int diff=target - nums[i];
            if(hm.containsKey(diff)) {
                int index=hm.get(diff);
                if(i<index) {result[0]=i;result[1]=index;}
                else {result[1]=i;result[0]=index;}
                return result;
            }
            else hm.put(nums[i],i);
        }
        return result;
    }
}
