class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            
            if( i>0 && nums[i]==nums[i-1]){
                 continue;
            };
           
            int s = i+1;
            int e = n-1;
            while(s<e){
                int zeroSum = nums[i]+nums[s]+nums[e];
                if(zeroSum==0){
                    result.add(new ArrayList<>(List.of(nums[i], nums[s], nums[e])));
                    e--;
                    s++;

                    // Skip duplicate second numbers
                    while (s < e && nums[s] == nums[s - 1]) {
                        s++;
                    }

                    // Skip duplicate third numbers
                    while (s < e && nums[e] == nums[e + 1]) {
                        e--;
                    }
                }
                else if(zeroSum>0){
                    e--;
                }else{
                    s++;
                }

            }
        }
        return result;




        
    }
}
