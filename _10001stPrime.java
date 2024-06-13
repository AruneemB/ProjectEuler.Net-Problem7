import java.util.ArrayList;

public class _10001stPrime
{
    public static boolean checkPrime(long n)
    {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; (long) i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static long get_10001stPrime(int bound)
    {
        ArrayList<Long> primeNumbers = new ArrayList<>();
        boolean reached_10001stPrime = false;
        long i = 0;

        while(!reached_10001stPrime)
        {
            if(checkPrime(i)) primeNumbers.add(i);
            i++;
            reached_10001stPrime = primeNumbers.size() >= bound;
        }

        return primeNumbers.getLast();
    }

    public static void main(String[] args)
    {
        System.out.println(get_10001stPrime(10001));
    }
}
