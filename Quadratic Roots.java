
import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots=new ArrayList<Integer>();
        double d=b*b-(4*a*c);
        
        
        if(d<0)
        {
            roots.add(-1);
            return(roots);
            
        }
        double x1=((-b+Math.sqrt(d))/(2*a));
        x1=Math.floor(x1);
        double x2=((-b-Math.sqrt(d))/(2*a));
        x2=Math.floor(x2);
        if(x1>x2)
        {
        roots.add((int)x1);
        roots.add((int)x2);
        }
        if(x2>=x1)
        {
            roots.add((int)x2);
            roots.add((int)x1);
        }
        return(roots);
        
    }
}