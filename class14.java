package ExceptionHandling1;

import java.util.Scanner;
//exception handler porpogation
public class class14 {
    public static void main(String[] args) {
        try {
            //String str = "Java";
            String str="123";
            int i = Integer.parseInt(str); //throw Number format exeption

            int a = 50, b = 10;
            System.out.println("\n Result = " + (a / b)); //throws ArthmeticException

            int[] arr={1,2,3,4,5};
            Scanner scn=new Scanner(System.in);
            int pos;
            System.out.println("\n Enter position");
            pos=scn.nextInt();
            if(pos>=5)
                throw  new ArrayIndexOutOfBoundsException("Array Index Out of bounds exception");
            else
                System.out.println("\n arr[10] :" + arr[pos]);

            Object obj = null;
            System.out.println("\n " + obj.hashCode());
        }
        catch(NullPointerException ex)
        {
            System.out.println("\n Object is null");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(ArithmeticException ex)
        {
            System.out.println("\n Division by 0");
        }
        catch(NumberFormatException ex)
        {
            System.out.println("\n Number format Exception");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
        finally {
            System.out.println("\n This is a finally block");
        }
    }
}
