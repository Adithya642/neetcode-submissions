/*
we can ietrate over the array thrice and check i,j,k are not equal and sum is 0, add them to a list and add it to result TC-O(n3)
2. Iterate over the array and find complement for each number then implement the 2 sum then we can get i,j,k TC- TwoSum TC- O(n) Total TC- O(n2);  
find the complement for the fixed index - i 
the two sum should match to that index 
if we sort the array we get numbers in order now can we use 2 pointer approach to find those 2 numbers 

*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        // Try to refactor the map logic at end
        for(int i=0;i<nums.length;i++){
           if(nums[i]>0) break;
           if (i > 0 && nums[i] == nums[i - 1]) continue;
           int p1=i+1;
           
           int p2=nums.length-1;
            while(p1<p2){
                int sum =nums[p1]+nums[p2]+nums[i];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[p1],nums[p2]));
                    p1++;
                    p2--;
                    while(p1<p2 && nums[p1]==nums[p1-1]) p1++;
                }
                else if(sum>0) p2--;
                else p1++;
            }           
        }
        return res;
    }
}
/*
array- [ -1,0,1,2,-1,-4]
sort - [-4,-1,-1,0,1,2]
i->0->-4 comp=4
p1=1->-1, p2=5->2 - p1++ -> p1=-1,p2=2 -p1++ -> p1=0,p2=2 -> p1++ -> p1=1,p2=2 -> p1++ ->p1=2,p2=2 -exit 
i->1->-1 comp=1 
p1=2->-1 p2=5->2 -[-1,-1,2]
i->2->-1 comp=1 
p1=3->0, p2=5->2 -[-1,0,1]
i->3->0 comp=0
p1=4->1 p2=5->2 
*/