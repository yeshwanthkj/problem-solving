import java.util.*;
import java.io.*;

public class solution{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int k=sc.nextInt();
        System.out.println(canconvert(s,t,k)?"Yes":"No");
        
    }
    static boolean canconvert(String s,String t,int k)
    {
         if (s.length() + t.length() <= k) {
            return true;
        }
        
        /* Case 2 */
        int i = 0; // represents index of 1st non-matching character
        for (   ; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int minOperations = (s.length() - i) + (t.length() - i);
        return k >= minOperations && (k - minOperations) % 2 == 0;
    }
}
