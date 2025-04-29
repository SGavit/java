package advaced_datastructure;

public class PrimeNumber {
    public static void main(String[] args) {
        // Define the number to check
        int num = 29;  // You can change this value to test other numbers

        // Call the method to check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle the case for numbers less than or equal to 1
        if (n <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;  // n is divisible by i, so it's not prime
            }
        }
        return true;  // If no divisors found, n is prime
    }
}
