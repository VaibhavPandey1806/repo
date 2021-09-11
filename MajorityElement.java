import java.io.*;
import java.util.*;
class MajorityAlgorithm
{
    public static void main(String args[])
    {  
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("enter size of array");
        n=obj.nextInt();
        System.out.println("enter array");
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=obj.nextInt();
        System.out.println(Majority(arr,n));
    }
    static int Majority(int arr[], int size)
    {   
        int res=0;
        int count =1;
        for(int i=1;i<size;i++)
        {
            if(arr[res]==arr[i])
            {
                count++;
                
            }
            else
            count--;
            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]==arr[res])
            count++;
        }
        if(count<=size/2)
        {
            return -1;
        }
        else
        return arr[res];
        }
}