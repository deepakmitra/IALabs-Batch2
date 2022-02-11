package ExceptionHandling1;

class parent1
{
    public void func1()
    {
        try
        {
            int[] arr={1,2,3,4,5};
            System.out.println("\n arr[10] =" + arr[10]);
        }
        catch(Exception ex)
        {
            System.out.println("Array Inex out of bounds Exception");
        }
    }
}

class child1 extends parent1
{
    //overriding
    public void func1()
    {
        try
        {
            int a=10, b=0;
            System.out.println("\n a/b =" + (a/b));
        }
        catch(Exception ex)
        {
            System.out.println("Arithmetic Exception");
        }
    }
}
public class class16 {
    public static void main(String[] args) {
        child1 ob=new child1();
        ob.func1();
    }
}
