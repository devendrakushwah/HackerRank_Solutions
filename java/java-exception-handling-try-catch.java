// My HackerRank Submissions
//@Author - Devendra Kushwah
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.InputMismatchException;

public class Solution {

    public static void main(String[] args) {

        try
        {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z;            
           z=x/y;
           System.out.println(z);
        }
        catch(InputMismatchException e1)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException E)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch (Exception e)
        {
	       System.out.println(e);
        }

    }
}