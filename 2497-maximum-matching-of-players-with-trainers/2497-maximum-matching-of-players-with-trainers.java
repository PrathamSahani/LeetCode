class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
          Arrays.sort(players);
          Arrays.sort(trainers);int count =0;
          int i=players.length-1; int j=trainers.length-1;
          while(i>=0 && j>=0){
              if(players[i]<=trainers[j]){
                  i--;j--;count++;
              }else{
                  i--;
              }
          }
        //   for(int i=players.length-1; i>0; i--){
        //       for(int j=trainers.length-1; j>0; j--){
        //           if(players[i]<=trainers[j]){
        //               count++;
        //           }
        //       }
        //   }
          return count;
    }
}