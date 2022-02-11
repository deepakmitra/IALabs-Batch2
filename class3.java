package ExceptionHandling1;

import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        int sz;
        int[] arr;
        try
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("\n Enter size of the array :");
            sz=scn.nextInt();
            arr=new int[sz];
        }
        catch(Exception ex)
        {
            System.out.println("\n Negetive array size entered");
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
            System.out.println(ex.getStackTrace());
            System.out.println(ex.toString());

        }
        //this shall not be readed if Exception Object is taken in the top catch block
        /*
        catch(NegativeArraySizeException ex)
        {
            System.out.println("\n Negetive array size entered");
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
            System.out.println(ex.getStackTrace());
            System.out.println(ex.toString());
        }
        */
    }
}
