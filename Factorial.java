import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

            Solution obj = new Solution();
            int N;
            
          
            N = sc.nextInt();
            
          
            long a=obj.factorial(N);
            
            System.out.println(a);
        
    }
}


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
