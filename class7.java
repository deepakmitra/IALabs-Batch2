package ExceptionHandling1;

public class class7 {
    public static void func()
    {
        int[] arr={1,2,3,4,5};
        for(int x : arr)
            System.out.println(x);
        System.out.println("\n this is rest of the code after catch");
    }
    public static void main(String[] args) {
        try {
            /*
            String str = "Java";
            int i = Integer.parseInt(str); //throw Number format exeption

            int a = 50, b = 0;
            System.out.println("\n Result = " + (a / b)); //throws ArthmeticException

            int x = -6;
            System.out.println("\n Result : " + Math.sqrt(x));
            */
            Object obj = null;
            System.out.println("\n " + obj.hashCode());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
            //we can call other function from catch block
            //after catch block is executed, but not recommended
            func();
        }


    }
}
