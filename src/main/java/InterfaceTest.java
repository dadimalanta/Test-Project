public class InterfaceTest {
    public interface MyInterface{
        public void  dothis();
        public void dothat();
    }

    public static class MyInterfaceImp implements MyInterface{
        public void dothis(){
            System.out.println("Did this");
        }

        public void dothat(){
            System.out.println("Did that");
        }
    }

}
