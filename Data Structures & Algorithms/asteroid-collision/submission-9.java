class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        stack.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            int current = asteroids[i];
            if(current>0){
                stack.push(current);
            }else{
                boolean isExplode=false;
                while(!stack.empty() && stack.peek()>0){
                    int currStack=stack.peek();
                    if(Math.abs(currStack)>Math.abs(current)){
                        isExplode=true;
                        break;
                    }else if(Math.abs(currStack)<Math.abs(current)){
                        stack.pop();
                    }else{
                        stack.pop();
                        isExplode=true;
                        break;
                    }

                }
                if(!isExplode){
                    stack.push(current);
                }
                
            }
        }
      int[] result = new int[stack.size()];
        int index=0;
        while(!stack.empty()){
            result[index]=stack.pop();
            index++;
        };
        // reverse result array
for (int i = 0, j = result.length - 1; i < j; i++, j--) {
    int temp = result[i];
    result[i] = result[j];
    result[j] = temp;
}

return result;
        


        
    }
}