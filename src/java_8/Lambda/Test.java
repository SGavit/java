package java_8.Lambda;

interface NumberTest{
    boolean test(int a, int d);
}
class Test{
    public static void main(String[] args) {
        NumberTest a = (n,d)->(n%d)==0;
        Boolean result = a.test(20,2);
        System.out.println(result);
        if(a.test(30,2))
        {
            System.out.println("2 is the factor of 10");
        }

    }
}