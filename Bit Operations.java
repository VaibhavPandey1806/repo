import java.io.*;
import java.util.*;
class Bit
{
    public static int findBit(int n,int i)
    {
    int mask=1<<i;
    n=n&mask;
    if(n==0)
    {
    return 0;
    }
    
    else
    {
    return 1;
    
    }
    }
    public static int SetBit(int n,int i)
    {
        int mask=1<<i;
        n=n|mask;
        return n;
        
    }
    public static int clearBit(int n,int i)
    {
        int mask=1<<i;
        mask=~mask;
        n=n&mask;
        return n;
    }
    public static int convert(int a,int b)                       //no of bit to change from a to b//
    {
        int c=a^b;
        int i=0;
        while(c!=0)
        {
            i++;
            c=c&(c-1);
        }
        return i;
    }
    public static void main(String args[])
    {
        int n=10;
        int a=22;
        int b=27;
        System.out.println(convert(a,b));
    }
}