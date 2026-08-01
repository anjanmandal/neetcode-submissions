class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> result = new PriorityQueue<>((a,b)->Double.compare(distance(b),distance(a)));
        for(int [] point: points){
            result.offer((point));

            if(result.size()>k){
                result.poll();
            }
        };
        int [][] finalResult = new int [k][2];
        for(int i=0;i<k;i++){
            finalResult[i]=result.poll();
        }
        return finalResult;

    }
    private double distance(int[] point){
        double distance = Math.sqrt(Math.pow(point[0] - 0, 2) + Math.pow(point[1] - 0, 2));
        return distance;
    }
}
