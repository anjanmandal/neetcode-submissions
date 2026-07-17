class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=-1;
        for(int pile:piles){
            high=Math.max(pile,high);
        };
        while(low<high){
            int mid=low+(high-low)/2;
            if(canEatAll(piles,mid,h)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
        // Helper method: check if Koko can eat all bananas in h hours at speed k.
    private boolean canEatAll(int[] piles, int k, int h) {
        int hours = 0;
        for (int pile : piles) {
            // (pile + k - 1) / k is an integer way to compute Math.ceil((double) pile / k)
            hours += (pile + k - 1) / k;
        }
        return hours <= h;
    }
}
