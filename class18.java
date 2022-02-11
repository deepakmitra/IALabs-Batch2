package ExceptionHandling1;
class parent3
{
    //no exception is handeled
    public void func1()
    {
            int[] arr={1,2,3,4,5};
            System.out.println("\n arr[10] =" + arr[10]);
    }
}

class child3 extends parent3
{
    //overriding
    public void func2()
    {
        try
        {
            func1();
            int a=10, b=0;
            System.out.println("\n a/b =" + (a/b));
        }
        //it will catch the exception thrown by the parent class method
        catch(Exception ex)
        {
            System.out.println("\n Derived class catch");
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
            System.out.println(ex.getStackTrace().toString());
        }
    }
}
public class class18 {
    public static void main(String[] args) {
        child3 ob=new child3();
        ob.func2();
        ob.func1();
    }
}
