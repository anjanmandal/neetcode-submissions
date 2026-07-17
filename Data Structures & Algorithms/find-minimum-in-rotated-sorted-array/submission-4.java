class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        if(nums[start]>nums[end]){
             while(start<end){
            int mid=(start+end)/2;
            if(nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }
            else if(nums[mid]>nums[start]){
                start=mid;
            }else{
                end=mid;
            }
             }
        }else{
            return nums[start];

        }

       
        return -1;
        
    }
}
