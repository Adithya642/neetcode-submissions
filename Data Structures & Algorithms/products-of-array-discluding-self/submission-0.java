// eg -[-1,0,0,3,4] - [ 0,0,0,0,0];   
// eg- [1,2,3,4] - Prefix Array -[1,1,2,6] , Suffix Array - [24,12,4,1]
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int[] suffix=new int[nums.length];
        res[0]=1;
        suffix[nums.length-1]=1;
        int pro=1;
        for(int i=1;i<nums.length;i++){
            pro=pro*nums[i-1];
            res[i]=pro;
        }
         pro=1;
        for(int i=nums.length-2;i>=0;i--){
            pro=pro*nums[i+1];
            res[i]=res[i]*pro;
        }
        return res;
    }
}  
