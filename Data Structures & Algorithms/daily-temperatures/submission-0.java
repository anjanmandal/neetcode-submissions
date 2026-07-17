class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] popped;

        Stack<int[]> s = new Stack<>();

        int[] ans = new int[temperatures.length];
        s.add(new int[]{0 , temperatures[0]});
        for (int i = 1 ; i < ans.length ; i++){
            
            while(!s.isEmpty() && s.peek()[1] < temperatures[i]){
                popped = s.pop();
                
                ans[popped[0]] = i - popped[0];
                System.out.println(Arrays.toString(popped));
            }
            s.add(new int[]{i , temperatures[i]});
        }

        return ans;
        
    }
}
