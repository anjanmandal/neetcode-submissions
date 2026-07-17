class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,0,path,result);
        return result;
        
    }
    public void helper(int [] nums, int start, List<Integer> path,List<List<Integer>> result ){
     result.add(new ArrayList<>(path));

        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            helper(nums,i+1,path,result);
            path.remove(path.size()-1);
        }
    }
}
