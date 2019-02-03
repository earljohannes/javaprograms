

package CoreJava;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TryCatch 
{
    public static void main(String[] args) 
    {
        PrintWriter pw = null;
        try 
        {
            int[] a = {2,3,4,5};
            a[9] = 10/0;
            
            int b = 10/0;
        }
        
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception wala catch");
        }
        
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception wala catch");
        }
        
        
        
        catch(Exception e)
        {
            System.out.println(e+" worst programming practice");
        }
        

        
    }    
}
