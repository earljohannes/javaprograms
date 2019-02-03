
package number_theory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class coefficient_calculator 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        double Sx = 0;
        double Sy = 0;
        double Sx_X_Sy = 0;
        double Sx2 = 0;
        
        double xi = 0; 
        double yi = 0;
        
        double b0 = 0, b1 = 0;
        
        FileReader f;
        BufferedReader br ;
        
        
        try 
        {
            f = new FileReader("E://abc3.txt");
            br = new BufferedReader(f);
            
            for(int i=0; i<N ; i++)
            {

                try 
                {
                    xi = Double.parseDouble(br.readLine());
                    yi = Double.parseDouble(br.readLine());
                } 

                catch (IOException ex) {}
                
                //System.out.println("x = "+xi+"  y = "+yi);

                Sx = Sx + xi;
                Sy = Sy + yi;

                Sx_X_Sy = Sx_X_Sy + xi*yi;
                Sx2 = Sx2 + xi*xi;
            }
            
            //System.out.println(Sx+"  "+Sy+"  "+Sx_X_Sy+"  "+Sx2+"  ");

            b1 = ((N*Sx_X_Sy) - Sx*Sy)/(N*Sx2 - Sx*Sx) ;

            b0 = (Sy - b1*Sx)/N;

            System.out.println("Y = "+b0+" + "+b1+"x");
        } 
        
        catch (FileNotFoundException ex) 
        {
            
        }
        
        
        
        
    }
    
}
