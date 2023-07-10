class Solution {
    private void backtrack(int idx, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }return ;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            backtrack(idx, arr, target-arr[idx], ans, ds);
            ds.remove(ds.size()-1);
        }
        backtrack(idx+1, arr, target, ans, ds);
    }
 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, list, new ArrayList<>()); 
        return list;
    }
}