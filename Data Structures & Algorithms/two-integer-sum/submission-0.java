class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int search=target-nums[i];
            if(hm.containsKey(search)){
                int ind=hm.get(search);
                if(i!=ind) return new int[]{i,ind};
            }
        }
        return new int[]{};
    }
}
