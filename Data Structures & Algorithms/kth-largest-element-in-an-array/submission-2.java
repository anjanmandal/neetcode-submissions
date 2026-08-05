class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minQueue = new PriorityQueue();
        for(int i=0;i<nums.length;i++){
            // if(minQueue.contains(nums[i])){
            //     continue;
            // }
            minQueue.add(nums[i]);
            if(minQueue.size()>k){
                minQueue.poll();
            }
        };
        return minQueue.poll();
        
    }
}
