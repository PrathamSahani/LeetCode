//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
            if(ans)
                System.out.println("1");
            else
                System.out.println("0");
       }
    }
}
// } Driver Code Ends

class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&solve(board,i,j,""+board[i][j],word))
                return true;
            }
        }
        return false;
    }
    
    public static boolean solve(char [][]board,int row,int col,String temp,String word){
        if(board[row][col]=='-')
        return false;
        
        if(temp.length()>word.length())
        return false;
        
        if(temp.equals(word))
        return true;
        
        char ch=board[row][col];
         board[row][col]='-';
   
        
        if(col<board[0].length-1){
            boolean res=board[row][col+1]==word.charAt(temp.length())?solve(board,row,col+1,temp+board[row][col+1],word):false;
            if(res) return res;
        }
       if(col>0){
            boolean res=board[row][col-1]==word.charAt(temp.length())?solve(board,row,col-1,temp+board[row][col-1],word):false;
            if(res) return res;
        }
        if(row<board.length-1){
            boolean res=board[row+1][col]==word.charAt(temp.length())?solve(board,row+1,col,temp+board[row+1][col],word):false;
            if(res) return res;
        }
        if(row>0){
            boolean res=board[row-1][col]==word.charAt(temp.length())?solve(board,row-1,col,temp+board[row-1][col],word):false;
            if(res) return res;
        }
        
        board[row][col]=ch;
        return false;    
    }
}

