interface MyInterface{
    void myFunction();
}
class Main{
    int data = 170;
    public static void main(String [] args){
        Main a = new Main();

        MyInterface intFace = () -> {
            System.out.println("Data: " + a.data);
            a.data += 500;
            System.out.println("Data after modification: " + a.data);
        };

        intFace.myFunction();
    }
}