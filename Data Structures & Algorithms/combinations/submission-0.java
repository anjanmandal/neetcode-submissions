class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> state = new ArrayList<>();
        helper(result,1,state,k,n);
        return result;
    };
    
    
    public void helper(List<List<Integer>> result,int start, List<Integer> state, int k, int n){

        if(state.size()==k){
            result.add(new ArrayList<>(state));
            return;
        };

        for(int i=start;i<=n;i++){
            state.add(i);
            helper(result,i+1,state,k,n);
            state.remove(state.size()-1);
        };

    };
        
};