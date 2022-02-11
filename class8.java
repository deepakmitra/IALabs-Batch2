package ExceptionHandling1;

public class class8 {
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
            //not recommended, cyclic calling
            main(new String[]{"abc", "def"});
        }
    }
}
