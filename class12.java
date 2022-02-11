package ExceptionHandling1;
import java.util.*;

public class class12 {
    public static void main(String[] args) {
        //outer try
        try {
            //String str = "Java";
            String str="123";
            int i = Integer.parseInt(str); //throw Number format exeption
            //first innermost try
            try {
                int a = 50, b = 10;
                System.out.println("\n Result = " + (a / b)); //throws ArthmeticException
                //second inner inner try
                try
                {
                    int[] arr={1,2,3,4,5};
                    Scanner scn=new Scanner(System.in);
                    int pos;
                    System.out.println("\n Enter position");
                    pos=scn.nextInt();
                    if(pos>=5)
                        throw new ArrayIndexOutOfBoundsException("Array Index Out of bounds exception");
                    else
                        System.out.println("\n arr[10] :" + arr[pos]);
                }
                catch (ArithmeticException ex1)
                {
                    System.out.println("Division by Zero");
                    System.out.println(ex1.getClass());
                }
            }
            catch(ArrayIndexOutOfBoundsException ex2)
            {
                System.out.println("\n Array Index out of bounds exception");
            }/*
            catch(ArithmeticException ex3)
            {
                System.out.println("Division by Zero");
                System.out.println(ex3.getClass());
            }
            */
            try {
                Object obj = null;
                System.out.println("\n " + obj.hashCode());
            }
            finally {
                System.out.println("\n This is a finally block");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
            //block of code that can raise exception can also be part of catch block
            //not recommended
        }
    }
}
