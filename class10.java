package ExceptionHandling1;

public class class10 {
    public static void main(String[] args) {
        try {
            /*
            String str = "Java";
            int i = Integer.parseInt(str); //throw Number format exeption

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
            //block of code that can raise exception can also be part of catch block
            //not recommended
            try {
                int a = 50, b = 0;
                System.out.println("\n Result = " + (a / b)); //throws ArthmeticException
            }
            catch(Exception ex2)
            {
                System.out.println(ex2.getMessage());
                System.out.println(ex2.getClass());
            }
        }
    }
}
