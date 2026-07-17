class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // int index = minDiffIndex(arr ,x);
        // int[] array = new int[k];
        // array[0] = arr[index];
        // int l = index 

        // for ( int i = 0 ; i < k ; i++){

        // }
        // List<Integer> ans= new ArrayList<>();
        // int count=0;
        // int left=0;
        // int right;
        // int end=-1;
        // for(right=0;right<arr.length;right++){
        //      count++;
        //     if(count>k){
        //         if((Math.abs(arr[left]-x)<Math.abs(arr[right]-x) )|| (Math.abs(arr[left]-x)==Math.abs(arr[right]-x) && arr[left]<arr[right])){

        //             end =right-1;
        //             continue;

        //         }else{
        //             left++;
        //             count--;
        //         } 
        //     }
        //       end=right;
           

        //     }
          
     
        //       for (int i = left ; i <=end ; i ++){
        //     ans.add(arr[i]);
        // }
        // return ans;
        // }
List<Integer> ans = new ArrayList<>();
int count = 0;
int left = 0;
int right;
int end = arr.length - 1; // final right boundary

for (right = 0; right < arr.length; right++) {
    count++;

    if (count > k) {
        int leftDist  = Math.abs(arr[left] - x);
        int rightDist = Math.abs(arr[right] - x);

        // if right is worse, drop right and stop (sorted array -> later rights are even worse)
        if (leftDist < rightDist) {
            end = right - 1;
            break;
        }
        // tie: keep smaller values -> drop right
        else if (leftDist == rightDist && arr[left] < arr[right]) {
            end = right - 1;
            break;
        } 
        else {
            // drop left
            left++;
            count--;
        }
    }
}

for (int i = left; i <= end; i++) {
    ans.add(arr[i]);
}
return ans;

    }
    //     List<Integer> ans = new ArrayList<Integer>();
    //     int l = 0;
    //     for (int i = k ; i < arr.length ; i ++){
    //         if (Math.abs(arr[l] - x) <= Math.abs(arr[i]- x)){
                
    //             break;
    //         }else {
    //             l++;
    //         }
    //         //System.out.println(l);
    //     }
    //     System.out.println(l);
    //     for (int i = 0 ; i < k ; i ++){
    //         ans.add(arr[l]);
    //         l++;
    //     }
    //     return ans;

    // }
      
        
    // }
    // public int minDiffIndex(int[] arr , int x){
    //     int diff = 1000000;
    //     int diffIndex = 0;

    //     for (int i = 0 ; i < arr.length ; i++){
    //         if (Math.abs(arr[i] - x) < diff){
    //             diffIndex = i;
    //             diff = Math.abs(arr[i] - x);
    //         }
    //     }

    //     return diffIndex;
    // }

}