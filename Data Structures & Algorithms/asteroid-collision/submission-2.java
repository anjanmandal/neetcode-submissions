class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean alive = true;

            // collision only when stack top is + and incoming is -
            while (alive && !stack.isEmpty() && stack.peek() > 0 && a < 0) {
                int top = stack.peek();
                if (Math.abs(top) < Math.abs(a)) {
                    stack.pop();          // top dies, keep checking
                } else if (Math.abs(top) == Math.abs(a)) {
                    stack.pop();          // both die
                    alive = false;
                } else {
                    alive = false;        // incoming dies
                }
            }

            if (alive) stack.push(a);
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
