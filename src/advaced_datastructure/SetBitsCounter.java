package advaced_datastructure;

public class SetBitsCounter {

    // Method 1: Simple loop using bitwise AND
    public static int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {  // Check if the last bit is 1
                count++;
            }
            num = num >> 1; // Right shift the bits by 1
            System.out.println(num & 1);
            System.out.println(num);
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 12;  // Binary = 1100
        int result = countSetBits(number);
        System.out.println("Number of set bits in " + number + " is: " + result);
    }
}
