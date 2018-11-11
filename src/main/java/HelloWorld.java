
public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World!");


        InterfaceTest.MyInterface myInterface = new InterfaceTest.MyInterfaceImp();
        myInterface.dothis();
        myInterface.dothat();

    }
}