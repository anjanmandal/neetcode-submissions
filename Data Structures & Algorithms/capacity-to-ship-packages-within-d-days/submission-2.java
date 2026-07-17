class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int numberOfDays=getDays(weights,mid);
            if(numberOfDays<=days){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
    private int getDays(int [] weights,int weight){
        int limit=1;
        int curr=0;
        for(int i=0;i<weights.length;i++){
            curr+=weights[i];
            if(curr>weight){
                limit++;
                curr=weights[i];
            }
        }
        return limit;
    }
}