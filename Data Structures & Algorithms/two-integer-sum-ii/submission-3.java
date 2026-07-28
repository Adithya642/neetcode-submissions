/*Solve this in binary search
No Duplicates possible as mentioned only one solution is possible think of how to solve if there are duplicates
[1,2,3,4] tar=3
ans - [1,2]
search for the complement - if mid number is greater than complement answer is before mid , if not greater than mid
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int comp=target - numbers[i];
            int p1=i+1,p2=numbers.length-1;
          
            while(p1<=p2){
                int mid=(p2+p1)/2;
                if(numbers[mid]>comp){
                    p2=mid-1;
                }
               else if(numbers[mid]<comp){
                    p1=mid+1;
                }
               else{
                    return new int[]{i+1,mid+1};
                }
            }
        }
        return new int[0];
    }
}

/*
[2,3,4] - 
i=0 ->2  comp=1
p1=1,p2=2
mid=1 -> 3 
p2 = 0 ->2
*/