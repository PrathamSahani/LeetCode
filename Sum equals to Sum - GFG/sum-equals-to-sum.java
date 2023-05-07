//{ Driver Code Starts
//Initial Template for Java





import java.io.*;
import java.util.*;

class Array {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int t=sc.nextInt(); //input testcases
	    
	    while(t-->0) //Loop until we exhaust all testcases
	    {
	        int n=sc.nextInt(); //Input size of array n
	        int arr[]=new int[n]; //Declaring the array
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            arr[i]=x; //Assigning elements to array
	        }
	        
	        Solution ob=new Solution(); //object to call the function
	        System.out.println(ob.findPairs(arr,n)); //The functions you complete
	        
	    }
	}
}



// } Driver Code Ends


class Solution
{ 
    public int findPairs(int arr[],int n) 
    {    
        HashSet<Integer> hs = new HashSet<>();
        int count =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(hs.contains(arr[i]+arr[j])){
                    return 1;
                }else{
                    hs.add(arr[i]+arr[j]);
                }
            }
        }
        return 0;
        
    }
}