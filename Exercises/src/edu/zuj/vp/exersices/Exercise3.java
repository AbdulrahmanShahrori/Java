package edu.zuj.vp.exersices;

import java.util.Scanner;

public class Exercise3 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        
        double n = input.nextDouble();
        
        String list = "Convert from-to: \n";
        
        list += "1- inches to cm\n";
        
        list += "2- cm to inches\n";
        
        list += "3- feet to meter\n";
        
        list += "4- meter to feet\n";
        
        list += "5- dunm to hectares\n";
        
        list += "6- hectares to duhnm\n";
        
        list += "7- fah to cel\n";
        
        list += "8- cel to fah";
        
        System.out.println(list);
        
        System.out.print("Enter your choice: ");
        
        int ch = input.nextInt();
        
        switch(ch)
        {
            case 1: //inches to centimeters
            {
                double cm = n * 2.54;
                
                System.out.println(n + " inches is " + cm + " centimeters");
                
                break;
            }
            
            case 2: //centimeters to inches
            {
                double in = n / 2.54;
                
                System.out.println(n + " centimeters is " + in + " inches");
                
                break;
            }
            
            case 3: //feet to meters
            {
                double m = n * 0.3048;
                
                System.out.println(n + " feet is " + m + " meters");
                
                break;
            }
            
            case 4: //meters to feet
            {
                double ft = n / 0.3048;
                
                System.out.println(n + " meters is " + ft + " feet");
                
                break;
            }
            
            case 5: //dunams to hectares
            {
                double ha = n * 0.1;
                
                System.out.println(n + " dunams is " + ha + " hectares");
                
                break;
            }
            
            case 6: //hectares to dunams
            {
                double dunams = n / 0.1;
                
                System.out.println(n + " hectares is " + dunams + " dunams");
                
                break;
            }
            
            case 7: //Fahrenheit to Celsius
            {
                double c = (n - 32) / 1.8;
                
                System.out.println(n + " fahrenheit is " + c + " celsius");
                
                break;
            }
            
            case 8:
            {
                double f = (n * 1.8) + 32;
                
                System.out.println(n + " celsius is " + f + " fahrenheit");
                
                break;
            }
            
            default:
                
                System.out.println("Invlaid");
                
                break;
        }
    }
}
