class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] vis = new boolean[rooms.size()];
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int n = q.poll();
            vis[n] = true;
            for(int i=0; i<rooms.get(n).size(); i++){
                if(vis[rooms.get(n).get(i)]==false){
                    q.add(rooms.get(n).get(i));
                }
            }
        }
        for(int i=0; i<vis.length; i++){
            if(vis[i]==false)return false;
        }
        return true;
    }
}