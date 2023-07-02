class Solution {
    public void sortColors(int[] arr) {
           int zero=0, first = arr.length-1, i=0;
           while(i<=first && zero<=first){
               if(arr[i]==0){
                   swap(arr, zero++, i++);
               }else if(arr[i]==2){
                   swap(arr, first--, i);
               }
               else{
                   i++;
               }
           }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}