package ExceptionHandling1;
import java.util.*;

class myException extends Exception
{
    public myException(String msg)
    {
        super(msg);
    }
}
public class customexceptionclass {
    public static void main(String[] args) {
        int age;
        Scanner scn=new Scanner(System.in);
        try
        {
            System.out.println("\n enter age");
            age=scn.nextInt();
            if(age<18)
                throw new myException("Under age Exception");
            if(age>30)
                throw new myException("Over age Exception");
            System.out.println("Welcome board");
        }
        catch(myException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
