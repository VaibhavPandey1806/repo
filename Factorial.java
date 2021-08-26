// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        
            
            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;
            
            //taking N
            N = sc.nextInt();
            
            //calling factorial() method 
            //of class Factorial
            long a=obj.factorial(N);4
            
            System.out.println(a);
        
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public long factorial(int N) {
        long f=1;
       for(int i=1;i<=N;i++)
       {
           f=f*i;
       }
       return f;
    }
}
