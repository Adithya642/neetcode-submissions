/*
Approach- find the left max bar including that bar and rightMax bar including that bar find minimum between them and subtract the height of that bar it 
gives the amount of water it can hold.
*/
class Solution {
    public int trap(int[] heights) {
        int[] leftMax=new int[heights.length];
        leftMax[0]=heights[0];
        int[] rightMax= new int[heights.length];
        rightMax[heights.length-1]=heights[heights.length-1];
        for (int i=1;i<heights.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],heights[i]);
        }
        for (int i=heights.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],heights[i]);
        }
        int totalAmount=0;
        for(int i=0;i<heights.length;i++){
            int waterAmount=Math.min(leftMax[i],rightMax[i]) - heights[i];
            totalAmount=totalAmount + waterAmount;
        }
        return totalAmount;
    }
}
