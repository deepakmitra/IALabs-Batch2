package ExceptionHandling1;
class parent2
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
            System.out.println("Array Index out of bounds Exception");
        }
    }
}

class child2 extends parent1
{
    //no overriding

}
public class class17 {
    public static void main(String[] args) {
        child2 ob=new child2();
        ob.func1();
    }
}
