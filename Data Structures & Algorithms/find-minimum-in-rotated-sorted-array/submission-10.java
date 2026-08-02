class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;

       while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                // Mid is in the larger left section.
                // Minimum must be strictly after mid.
                start = mid + 1;
            } else {
                // Mid is in the smaller right section.
                // Mid could itself be the minimum.
                end = mid;
            }
        }

        return nums[start];
    }
}