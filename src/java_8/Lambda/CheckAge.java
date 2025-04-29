package java_8.Lambda;
interface In{
    boolean fun(int n);
}
public class CheckAge {
    public static void main(String[] args) {
        In a = (n) -> (n % 2) == 0;

        if(a.fun(34))
        {
            System.out.println("Is Even");
        }
        else{
            System.out.println("Is Odd");

        }
    }
}
