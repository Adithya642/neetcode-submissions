class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        int[] temp=intervals[0];
        List<int[]> result=new ArrayList<>();
        result.add(temp);
        int i=1;
        while(i<intervals.length){
            int[] last=result.get(result.size()-1);
            if(last[1]>intervals[i][0]){
                // last[1]=Math.ma
                result.set(result.size()-1,new int[]{last[0],
                Math.min(last[1],intervals[i][1])});
            }
            else result.add(intervals[i]);
            i++;
        }
        return intervals.length-result.size();
    }
}
