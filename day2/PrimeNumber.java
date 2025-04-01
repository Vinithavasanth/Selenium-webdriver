package week1.day2;

public class PrimeNumber {

	static boolean isPrime(int n)
    {
        // Checking number greater than 1
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // main program for prime
    public static void main(String args[])
    {
        if (isPrime(11))
            System.out.println(" true");
        else
            System.out.println(" false");
       
    }
}

