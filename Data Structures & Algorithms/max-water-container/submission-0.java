
/*
Brute Force - Iterate on every 2 bars and calculate the amount it stores then update maximum every time - O(n2)
Optimized-  To hold the maximum water one of the bar should be maximum left pointer to hold the left bar and right pointer to hold the right bar if left bar
 is less than right bar move left pointer  and viceversa , everytime store the maximum amount of water and update the maximum
*/class Solution {
    public int maxArea(int[] heights) {
        int lBar=0,rBar=heights.length-1;
        int maxAmount=0;
        while(lBar<rBar){
            int minHeight=Math.min(heights[lBar],heights[rBar]);
            int width=rBar-lBar;
            maxAmount=Math.max(maxAmount, width * minHeight);
            if (heights[lBar] < heights[rBar]) lBar++;
            else rBar--; 
        }
        return maxAmount;
    }
}

/*
height- [1,7,2,5,4,7,3,6] 
lBar=0, rBar=7 , max=0
0<7 - minHeight=1 ,width=7 ,maxAmount=7 , lBar=1
1<7 - minHeight=6, width=6, maxAmount=36 , rBar=6
1<6 - minHeight=3, width=
1<5
1<4
1<3
1<2
1<1
*/
