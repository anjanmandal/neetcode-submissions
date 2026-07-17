public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int [temperatures.length];
        Stack<int[]> stack = new Stack();
        for(int i=0;i<temperatures.length;i++){
            int current = temperatures[i];
            while(!stack.isEmpty() && current>stack.peek()[1]){
                result[stack.peek()[0]]=i-stack.pop()[0];
            }

            stack.push(new int[]{i, current});

        }
        return result;

        
    }
}