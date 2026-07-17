class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=0;
        while(i<j){
            int right = heights[i];
            int left=heights[j];
            if(right<left){
                max=Math.max(max,right*(j-i));
                i++;
            }else{
                max= Math.max(max,left*(j-i));
                j--;
            }

        }
        return max;
        
    }
}
