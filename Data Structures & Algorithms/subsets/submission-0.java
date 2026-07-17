class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        subsetHelper(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void subsetHelper(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: if index reaches the end of the array, add a copy of the current subset to result
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Include the current number in the subset
        current.add(nums[index]);
        subsetHelper(nums, index + 1, current, result);
        
        // Backtrack: remove the last added number before exploring the exclusion branch
        current.remove(current.size() - 1);
        
        // Exclude the current number and move to the next
        subsetHelper(nums, index + 1, current, result);
    }
}