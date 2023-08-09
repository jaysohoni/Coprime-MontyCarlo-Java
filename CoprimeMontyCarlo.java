import java.util.*;
public class CoprimeMontyCarlo
{
    public static boolean coprime(int a, int b)
    {
        int count = 0;
        for(int i = 1; i <= Math.min(a,b); i++)
        {
            if((a % i == 0) && (b % i == 0))
            {
                count++;
            }
        }
        if(count == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String [] args)
    {
        Random r = new Random();
        int trials = 100000; double success = 0;
        for(int i = 0; i < trials; i++)
        {
            int a = r.nextInt();
            int b = r.nextInt();
            if(coprime(a,b))
            {
                success++;
            }
        }
        double prob = (success/trials)*100;
        System.out.println(prob);
    }
}
