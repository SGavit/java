package java_8.Lambda;
//The Factorial is the product of all positive integers form 1 to n
interface Factorial{
    int compute(int n);
}
public class BlockLamda {
    public static void main(String argr[]){
        Factorial f = (int n) ->{
            int result = 1;
            for(int i = 1;i <= n; i++)
            {
                //1*2*3*4*5 = 120
                result *= i;
            }
            return result;
        };
        // Test the lambda 
        System.out.println("Factorial of 5 is : " + f.compute(5)); // 120

        //Note :- 1*0 = 1 and 1*1 = 1 

    }
}
