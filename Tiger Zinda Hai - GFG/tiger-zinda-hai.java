//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    String arr [] = new String[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = elements[i];
		    }
		    
		    
		    Solution obj = new Solution();
		    int res = obj.count_tabs(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}


            

// } Driver Code Ends


//User function Template for Java


class Solution{
   
    // Function for finding maximum and value pair
    public static int count_tabs (String arr[], int n) {
        
       HashSet<String> h = new HashSet<>();
       for(int i=0; i<n; i++){
           if(arr[i].equals("END"))h.clear();
           else if(h.contains(arr[i]))h.remove(arr[i]);
           else h.add(arr[i]);
       }
      return h.size();
        
    }
    
    
}


