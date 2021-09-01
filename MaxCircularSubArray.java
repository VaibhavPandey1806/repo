 // { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		     System.out.println("enter n");
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
            System.out.println("enter array");
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+a[i];
        int res;
        
         res=sum-MinArr(a,n);
         int res1=MaxArr(a,n);
         if(res1<0)
         return res1;
        
        return Math.max(res,res1);
    }
    public static int MinArr(int arr[],int n)
    {
        
        int min=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            min=Math.min(min+arr[i],arr[i]);
            res=Math.min(res,min);
        }
        return res;
    }
    public static int MaxArr(int arr[],int n)
    {
        int max=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(max+arr[i],arr[i]);
            res=Math.max(res,max);
        }
        return res;
    }
    
    
}
