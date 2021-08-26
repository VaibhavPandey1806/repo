import java.io.*;
import java.util.*;
class TrappingRain
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter length of array");
    n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    arr[i]=sc.nextInt();
    System.out.println(TrapRain(arr,n));
    System.out.println(TrapRain1(arr,n));

}
public static int TrapRain(int arr[],int n)
{
    int Lmax=0;
    int Rmax=0;
    int res=0;
    for(int i=1;i<n-1;i++)
    {
       Lmax=arr[i];
      for(int j=0;j<i;j++)
      {
          Lmax=(int)Math.max(Lmax,arr[j]);
      }
      Rmax=arr[i];
      for(int j=i;j<n;j++)
      {
          Rmax=(int)Math.max(Rmax,arr[j]);
      }
      res=res+((int)Math.min(Lmax,Rmax))-arr[i];

    }
    return res;
}
public static int TrapRain1(int arr[],int n)
{
    int res = 0;

    int lMax[] = new int[n];
    int rMax[] = new int[n];

    lMax[0] = arr[0];
    for(int i = 1; i < n; i++)
        lMax[i] = Math.max(arr[i], lMax[i - 1]);


    rMax[n - 1] = arr[n - 1];
    for(int i = n - 2; i >= 0; i--)
        rMax[i] = Math.max(arr[i], rMax[i + 1]);

    for(int i = 1; i < n - 1; i++)
        res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
    
    return res;

}
}