class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,current,target,result,0);
        return result;

        
    }
    public void helper(int [] candidates, List<Integer> current,int target, List<List<Integer>> result,int start ){

        if(sum(current)==target){
            result.add( new ArrayList(current));
            return;
        }else if(sum(current)>target){
            return;
        }else{
            for(int i=start;i<candidates.length;i++){
                 if (i > start && candidates[i] == candidates[i - 1]) {
        continue; // skip this sibling, but keep trying later ones
    }
                current.add(candidates[i]);
                helper(candidates,current,target,result,i+1);
                current.remove(current.size()-1);
            }
        }
    }
    public int sum(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            sum += list.get(i);
        }
        return sum;
    };


}
