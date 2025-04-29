package advaced_datastructure;

public class GCD {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
    public static int findGCD(int a, int b){
        while(b !=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    //Using recursive
    public static int findGCDR(int a, int b) {
        // Base case: if b is 0, return a as the GCD
        if (b == 0) {
            return a;
        }

        // Recursive case: call the function with b and a % b
        return findGCDR(b, a % b);
    }
}
