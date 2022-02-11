package ExceptionHandling1;

import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        int sz, i=-1;
        long l=1;
        char ch;
        int[] arr;
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("\n Enter size of the array :");
            sz = scn.nextInt();
            arr = new int[sz];

            do {
                System.out.println("\n arr[" + ++i + "]=");
                arr[i]= scn.nextInt();

                System.out.println("\n Do you want to continue (y/n) :");
                ch=scn.next().charAt(0);
            }while((ch=='Y')||(ch=='y'));

            for(int x : arr)
                l+=(long)(Math.random())*(x*123456678);
            System.out.println("Sum : " + l);
        }
        catch(NegativeArraySizeException ex1)
        {
            System.out.println("\n Negetize size provided for array");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array Index out of bounds");
        }
        catch(RuntimeException ex)
        {
            System.out.println("Runtime exception Occured");
        }
        finally
        {
            System.out.println("\n Finally block executed");
        }
    }
}
