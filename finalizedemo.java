package ExceptionHandling1;

public class finalizedemo {
    public void finalize()
    {
        System.out.println("\n this is finalize block");
    }
    public static void main(String[] args) {
        class15 ob1=new class15();
        class14 ob2=new class14();
        ob1=null;
        ob2=null;
        //forcibly calling garbage collector but its a request
        //it is upto jre to call the garbage collector
        System.gc();
    }
}
