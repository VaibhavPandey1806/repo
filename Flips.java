import java.io.*;
import java.util.*;
class Flips//to find minimum flips to convert whole array to either one or zero
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size");
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        FlipArr(arr,n);
    }
    public static void FlipArr(int arr[],int n)
    {    int c=0;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                if(arr[i]!=arr[0])
                {
                    System.out.print("from "+i+" to ");

                }
                else 
                {
                    System.out.println(i-1);
                    c++;
                }
                
            }
        }      
        if(arr[n-1]!=arr[0])
        {
        System.out.println(n-1);
        c++;
        }
        if(c==0)
        System.out.println("array is already flipped with all "+arr[0]+"'s");
        else
        System.out.println(c+" Flips were required");
    }

    
    


}