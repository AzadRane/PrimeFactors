/* contributed by harish rane */

import java.io.*;
import java.util.*;

public class PrimeF
{

    static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    if(isPrime(i))
                    {
                        System.out.println(i);
                    }
                }
            }
    }
}
