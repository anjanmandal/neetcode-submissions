class Solution {
    public boolean search(int[] nums, int target) {
        int right=nums.length-1;
        int left= 0;
        while(left<=right){
                        int mid = left + (right - left) / 2;

            if(nums[mid]==target){
                return true;
            }
               if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
                continue;
            }
            if(nums[left]>=nums[right]){
                if(target<nums[left]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }

            }else{
                if(target>nums[mid]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return false;
        
    }
}