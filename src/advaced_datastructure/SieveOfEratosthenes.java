package advaced_datastructure;

public class SieveOfEratosthenes {

    // Function to find all prime numbers up to n
    public static void sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];

        // Assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Eliminate non-primes
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark all multiples of p as false
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print all primes
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50;  // You can change this to any number
        sieve(n);
    }
}
