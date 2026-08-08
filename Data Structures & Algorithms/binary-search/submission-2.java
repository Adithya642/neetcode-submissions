/*
Binary search TC will be O(log n)
it only checks one element at each level so it will be log n times.
*/
class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target) return mid;
            else if (nums[mid]>target) {
                right=mid-1;
            }
            else left=mid+1;
        }
        return -1;
    }
}
/*
[-1,0,3,5,9,12] ,tar=9
left=0,right=6 
(0<6) mid=3 nums[mid]=5 left=4 ,right=6
(4<6) mid=5 nums[mid]=12 left=4, right=4
(4<=4) mid=4 , nums[mid]=9 return 4;
*/