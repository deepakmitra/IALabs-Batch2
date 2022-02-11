package ExceptionHandling1;
import java.io.*;

public class class1 {
    public static void main(String[] args)
            throws IOException, ArithmeticException, ArrayIndexOutOfBoundsException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n enter an Integer :");
        int x=Integer.parseInt(br.readLine());

        System.out.println("\n x = " + x);

        for(int i=5; i>0; --i)
            System.out.println("\n Result : " + (25/i));

        int[] arr=new int[-5];
        arr[10]=100;
    }
}
