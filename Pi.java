import java.util.Scanner;

/**
 * Lab05d - Approximating the Constant Pi
 * @author Eylul Badem
 * @version 24.11.2020
*/ 
public class Lab05d
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        // Variables
              
        int input;
        double output = 0.0;
        boolean positive = true; 

        // Program Code
        
        // 1-Print out constant Pi
        System.out.println( "1) pi="+ Math.PI);

        // 2-Ask for & get the wanted number of terms of the series to compute from the user
        System.out.print( "2) enter the number of terms of the series to compute:");
        input = scan.nextInt(); 
        
       // 2.1-Compute Pi accordingly to the given formula, repeating as wanted number of terms by the user
       for (int i=0; i<input; i++) { 
           double sum = 1.0/( 2.0*( ( double)i) + 1.0); 
           if ( positive) 
           output = output + sum; 
           else 
               output = output - sum; 
               positive = !positive; 
        }
           // 2.2-Print out the computed value of Pi 
           System.out.println( "Pi is " + output*4);
        
           // 3-Ask for & get the wanted number of terms of the series to compute from the user
           System.out.print( "3) enter the number of terms of the series to compute:");
           input = scan.nextInt(); 
           
           // 3.1-Ask for & get the wanted accuracy from the user
           System.out.print( "enter an accuracy:");
           int acc = scan.nextInt(); 
           
           output = 0.0;
           positive = true; 
          
           // 3.2-Compute Pi accordingly to the given formula, repeating as wanted number of terms by the user
           for ( int i = 0; i < input; i ++ ) { 
              double sum = 1.0/( 2.0*( ( double)i) + 1.0); 
              if( positive) 
                   output = output + sum;
              else 
                  output = output - sum; 
                  positive = !positive; 
            }
            
              // 3.3-Format the number of decimal places as the user wanted
              System.out.printf( "Pi is %." + acc + "f %n", output*4);
        
        scan.close();
    }
    
}

