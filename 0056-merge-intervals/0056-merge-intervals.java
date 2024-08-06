class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> merged = new ArrayList<>();
         Arrays.sort(arr, (a, b)-> Integer.compare(a[0], b[0]));
         merged.add(new int[]{arr[0][0], arr[0][1]});
         
         for(int i=1; i<arr.length; i++){
             if(merged.get(merged.size()-1)[1]>=arr[i][0]){
    merged.get(merged.size()-1)[1] = Math.max(arr[i][1], merged.get(merged.size()-1)[1]);
    
             }else{
                 merged.add(new int[]{arr[i][0], arr[i][1]});
             }
         }
         int[][] res = new int[merged.size()][2];
         for(int i=0; i<merged.size(); i++){
             res[i] = merged.get(i);
         }
         return res;
    }
}