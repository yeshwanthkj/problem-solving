import java.io.*;
import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int jump=0;
        int ci=0;
        for(int i=0;i<n;i++)
        {   if(i+2<n)
        {
            if(ar[i+1]==0&&ar[i+2]==0)
            {
                i++;
                jump++;
            }
            else if(ar[i+1]==0&&ar[i+2]==1)
            {
    
                jump++;
            }
            else if(ar[i+1]==1&&ar[i+2]==0)
            {
                i++;
                jump++;
            }
            
        }
    
        }
        if(ar[n-1]==0&&ar[n-2]==0)
            {
                jump++;
            }
        System.out.println(jump);
    }
}
