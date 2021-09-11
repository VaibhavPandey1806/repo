import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		     System.out.println("enter length");
			int n = sc.nextInt();
			int a[] = new int[n];		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			insertionSort(a,n);
			 printArray(a,n);
			
	
	}
  
  public static void insertionSort(int arr[], int n)
  {
      int key=0;
      int j=0;
      for(int i=1;i<n;i++)
      {
          key=arr[i];
          j=i-1;
          while(j>=0&&arr[j]>key)
          {
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=key;
      }
  }
}