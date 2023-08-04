class Solution {
    public boolean canFinish(int numCourses, int[][] p) {
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
          for(int i=0; i<numCourses; i++)
          {
              adj.add(new ArrayList<>());
          }
          for(int i=0; i<p.length; i++){
              adj.get(p[i][1]).add(p[i][0]);
          }
          Queue<Integer> q = new LinkedList<>();
          int ans[] = new int[numCourses];
          for(int i=0; i<numCourses; i++){
              for(int it: adj.get(i))
               ans[it]++;
          }
          for(int i=0; i<numCourses; i++){
              if(ans[i]==0)
              q.add(i);
          }
          int count=0;
          while(!q.isEmpty()){
              int node = q.poll();
             
              count++;
              for(int it: adj.get(node)){
                  ans[it]--;
                 if(ans[it]==0)q.add(it);
              }
          }
          if(numCourses==count)return true;
          return false;
    }
}