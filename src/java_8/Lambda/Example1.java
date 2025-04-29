package java_8.Lambda;
//Example of Instance Varible 
interface MyFun{
    void myFun();
}
public class Example1 {
    int data = 100;
    public static void main(String[] args) {
        Example1 a =new  Example1();
        MyFun intfun = ()->{
           
            a.data +=500;
            System.out.println("Data :"+a.data);
        };
        intfun.myFun();
        System.out.println(a.data);
        
    }
}
