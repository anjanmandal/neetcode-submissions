class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int first=0;
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            first=nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum= first+nums[right]+nums[left];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    List<Integer> sublist= new ArrayList<>();
                    sublist.add(first);
                    sublist.add(nums[right]);
                    sublist.add(nums[left]);
                    result.add(sublist);
                    right--;
                    left++;
                }
            }
        }
        return new ArrayList<>(new LinkedHashSet<>(result));

        
    }
}
