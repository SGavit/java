package advaced_datastructure;

public class CountDigits {
    public static void main(String[] args) {
        // Define a number directly
        long number = 123456789;  // You can change this to any number

        // Variable to store the count of digits
        int count = 0;

        // Handle the case of 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count the digits
            while (number != 0) {
                number /= 10;  // Remove the last digit
                count++;       // Increment the count
            }
        }

        // Output the result
        System.out.println("Number of digits: " + count);
    }
}
