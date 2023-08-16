class Solution {
    public int canCompleteCircuit(int[] petrol, int[] cost) {
        int total =0, current =0, start =0;
        for(int i=0; i<petrol.length; i++){
            total +=petrol[i]-cost[i];
            current+=petrol[i]-cost[i];
            if(current<0){
                start =i+1;
                current =0;
            }
        }
        if(total>=0)return start;
        else
        return -1;
    }
}