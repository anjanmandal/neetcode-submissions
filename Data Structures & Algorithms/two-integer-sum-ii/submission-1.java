class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int s=0;
        int e=n-1;
         int [] result = new int[2];
        while(s<e){
            int sum = numbers[s]+numbers[e];
            if(sum==target){
                result[0]=s+1;
                result[1]=e+1;
                return result;
            }else if(sum>target){
                e--;

            }else{
                s++;
            }
        }
        return result;
        

        
    }
}
