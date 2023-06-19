class Solution {
    public int findMinArrowShots(int[][] points) {
       int arrow = 1;
       int last = points[0][1];
         Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
         for(int i=0; i<points.length; i++){
             if(points[i][0]>last){
                 arrow++;
                 last = points[i][1];

             }
             else last = Math.min(last, points[i][1]);
         }
         return arrow;
    }
}