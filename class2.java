package ExceptionHandling1;
import java.util.*;

public class class2 {
    public static void main(String[] args) {
        int sz;
        int[] arr;
        try
        {
            Scanner scn=new Scanner(System.in);
            System.out.println("\n Enter size of the array :");
            sz=scn.nextInt();
            if(sz<0)
                throw new NegativeArraySizeException("Negative Size");
                //throw new NegativeArraySizeException(); //show null message
            else
                arr=new int[sz];
        }
        catch(NegativeArraySizeException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
