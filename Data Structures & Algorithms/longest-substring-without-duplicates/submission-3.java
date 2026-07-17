class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int first=0;
        int second =1;
        Set<Character> set= new LinkedHashSet<>();
        set.add(s.charAt(first));
        int max=1;
        while(second<s.length()){
            if(set.contains(s.charAt(second))){
                while(set.contains(s.charAt(second))){
                    set.remove(s.charAt(first));
                    first++;
                }
            }
            max = Math.max(max,second-first+1);
            set.add(s.charAt(second));
            second++;
           

        }
        return max;
        
    }
}
