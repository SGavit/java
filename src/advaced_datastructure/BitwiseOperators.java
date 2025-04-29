package advaced_datastructure;

public class BitwiseOperators {
    public static void main(String[] args) {
//  Bitwise operators only work with integer types: byte, short, int, long, and char.
//  They do not work with float, double, or boolean.
//  Useful in low-level programming, graphics, device drivers, and optimization.
        int a = 5;
        int b = 3;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);
        System.out.println(a | b);

    }
}
