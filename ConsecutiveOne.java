import java.io.*;
import java.util.*;
class ConsecutiveOne
{
    public static void main(String args[])
    {   Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("enter size of array");
        n=obj.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=obj.nextInt();
        System.out.println(ConsecOne(arr,n));
    }
    public static int ConsecOne(int arr[],int n)
    {
        int curr=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            curr=0;
            if(arr[i]==1)
            {
            curr++;
            res=Math.max(curr,res);
            }
        }
        return res;
    }
}