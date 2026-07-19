class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(nums,current,target,result,0);
        return result;

        
    }
    public void helper(int [] nums, List<Integer> current,int target, List<List<Integer>> result,int start ){

        if(sum(current)==target){
            result.add( new ArrayList(current));
            return;
        }else if(sum(current)>target){
            return;
        }else{
            for(int i=start;i<nums.length;i++){
                current.add(nums[i]);
                helper(nums,current,target,result,i);
                current.remove(current.size()-1);
            }
        }
    }
    public int sum(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            sum += list.get(i);
        }
        return sum;
    };


}
