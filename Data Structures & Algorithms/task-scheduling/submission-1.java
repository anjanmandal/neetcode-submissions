class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freq = new int[26];
        //succesfully assigned 
        for(char c:tasks){
            freq[c-'A']++;
        }

        PriorityQueue<Integer> MQ= new PriorityQueue<>(Collections.reverseOrder());
        for(int f:freq){
            if(f>0)MQ.offer(f);
        }
        List<Integer> buffer= new ArrayList<>();
        int interval=0;
        while(!MQ.isEmpty()){
            buffer.clear();
            for(int i=0;i<=n;i++){
            if(!MQ.isEmpty()){
                int num = MQ.poll();
                if(num-1>0){
                    buffer.add(num-1);
                }
                interval++;
            }else{
                if(buffer.isEmpty()){
                    break;
                }
                interval++;
            }
            }
            for(int rem:buffer){
                MQ.offer(rem);
            }
        }
        return interval;

        
    }
}
