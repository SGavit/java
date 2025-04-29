package advaced_datastructure;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 60;  // You can change this number to test others

        System.out.println("Prime factors of " + number + " are:");

        // Divide by 2 until number is odd
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number = number / 2;
        }

        // Check odd numbers from 3 upwards
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

        // If number is still greater than 2, then it's a prime factor
        if (number > 2) {
            System.out.print(number);
        }
    }
}

