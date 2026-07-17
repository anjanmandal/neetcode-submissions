class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                  StringBuilder part = new StringBuilder();
                while(stack.peek()!='['){
                    char curr= stack.pop();
                    part.append(curr);
                }
                stack.pop();
                part.reverse();
                  int base = 1;
            int times = 0;
            while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                times += (stack.pop() - '0') * base;
                base *= 10;
            }
                String repeated = part.toString().repeat(times);
                for(int j=0;j<repeated.length();j++){
                    stack.push(repeated.charAt(j));
                }
            }else{
                stack.push(s.charAt(i));
            }

        }
           StringBuilder ans = new StringBuilder();
        for (char c : stack) ans.append(c);
        return ans.toString();
        
    }
}