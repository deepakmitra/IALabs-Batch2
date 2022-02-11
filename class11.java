package ExceptionHandling1;

public class class11 {
    public static void main(String[] args) {
        try {
            String str = "Java";
            int i = Integer.parseInt(str); //throw Number format exeption
        }
        //Handling different type of exception than what it occurs
        //jre shall take over and raise correct exception
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
    }
}
