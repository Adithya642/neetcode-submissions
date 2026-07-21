/* Take a hashmap and store the element and its index as key,value
Iterate over the array if the value after subtracting from target exists in map return the index and the index should not match with element index 
This gives the answer 
*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        int result[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            hm.putIfAbsent(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++){
            int diff=target-numbers[i];
            if(hm.containsKey(diff)){
                int val=hm.get(diff);
                if(val!=i) {
                    result[0]=i+1;
                    result[1]=val+1;
                    break;
                }
            }
        }
        return result;
    }
}
/*
[1,2,3,4], targ=3
map -[[1,0],[2,1],[3,2],[4,3]]
i->0->1 diff=2, if()-true, val=1, if()-true, result[0]-1, result[1]-2;
*/