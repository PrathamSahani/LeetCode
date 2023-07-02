class Solution {
    public int longestConsecutive(int[] arr) {
       HashSet<Integer> set = new HashSet<>();
       for(int i=0; i<arr.length; i++){
           set.add(arr[i]);
       }
       int ans =0;int count =0;
       ArrayList<Integer> list = new ArrayList<>(set);
       Collections.sort(list);
       for(int i=0; i<list.size(); i++){
           if(i>0 && list.get(i)==list.get(i-1)+1){
               count++;
           }else{
               count=1;
           }
           ans = Math.max(ans, count);
       }
       return ans;
   

           }
}