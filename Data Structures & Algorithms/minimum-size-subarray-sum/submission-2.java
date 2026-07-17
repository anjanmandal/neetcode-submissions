class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==1) {
            if(nums[0]>=target){
                return 1;
            }else{
return 0;
            }
        }
        int left =0;
        int right=1;
        int min = Integer.MAX_VALUE;
        int sum=nums[left];
        if(sum>=target){
            return 1;
        }
        while(right<nums.length){
             sum+=nums[right];
            if(sum>=target){
                while(takesum(left,right,nums)>=target && left<=right){
                    sum-=nums[left];
                    left++;
                }
                left--;
                sum+=nums[left];
                min=Math.min(min,(right-left)+1);
            }
            right++;
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }else{
            return min;
        }
    }
    private int takesum(int start,int end,int[]nums){
        int sum=0;
        for (int i=start;i<=end;i++){
            sum+=nums[i];

        }
        return sum;
    }
}