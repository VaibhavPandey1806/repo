import java.io.*;
import java.util.*;
class FirstOccurence
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter length of array");
      n=sc.nextInt();
      System.out.println("enter array");
      int [] arr=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("enter no. to be searched");
      int x=sc.nextInt();
      System.out.println(FirstOccur(arr,n,x));
    }
    public static int FirstOccur(int arr[],int n,int x)
    {
        int high=n-1;
        int low=0;
        while(low <= high)
		{
			int mid = (low + high) / 2;

			if(x > arr[mid])
				low = mid + 1;

			else if(x < arr[mid])
				high = mid - 1;

			else
			{
				if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;

				else
					high = mid - 1;
			}

		}

		return -1;
	}
    
}
