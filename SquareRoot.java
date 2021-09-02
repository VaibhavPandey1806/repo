import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {  long ans=-1;
		long low=0;
		long high=(int)x;
		long square;
		while(low<=high)
		{
		   long  mid=(low+high)/2;
		    square=mid*mid;
		    if(square>x)
		    high=mid-1;
		    else
		    if(square==x)
		    return mid;
		    else
		    if(square<x)
		    {
		        low=mid+1;
		        ans=mid;
		    }
		}
		return ans;
	 }
}