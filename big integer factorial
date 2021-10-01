import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class solution
{
      static BigInteger fact(int N)
    {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
  
        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));
  
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger res=fact(n);
        System.out.println(res);
    }
}
