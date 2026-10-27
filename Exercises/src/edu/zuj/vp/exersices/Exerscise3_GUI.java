package edu.zuj.vp.exersices;

import javax.swing.JOptionPane;

public class Exerscise3_GUI {
    
    public static void main(String[] args) {
        
        double n = Double.parseDouble(JOptionPane.showInputDialog("Enter a number:"));
        
        String list = "Convert from-to: \n";
        
        list += "1- inches to cm\n";
        
        list += "2- cm to inches\n";
        
        list += "3- feet to meter\n";
        
        list += "4- meter to feet\n";
        
        list += "5- dunm to hectares\n";
        
        list += "6- hectares to duhnm\n";
        
        list += "7- fah to cel\n";
        
        list += "8- cel to fah";
        
        int ch = Integer.parseInt(JOptionPane.showInputDialog(list + "\nEnter your choice:"));
        
        switch(ch)
        {
            case 1: //inches to centimeters
            {
                double cm = n * 2.54;
                
                JOptionPane.showMessageDialog(null, n + " inches is " + cm + " centimeters");
                
                break;
            }
            
            case 2: //centimeters to inches
            {
                double in = n / 2.54;
                
                JOptionPane.showMessageDialog(null, n + " centimeters is " + in + " inches");
                
                break;
            }
            
            case 3: //feet to meters
            {
                double m = n * 0.3048;
                
                JOptionPane.showMessageDialog(null, n + " feet is " + m + " meters");
                
                break;
            }
            
            case 4: //meters to feet
            {
                double ft = n / 0.3048;
                
                JOptionPane.showMessageDialog(null, n + " meters is " + ft + " feet");
                
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
                
                JOptionPane.showMessageDialog(null, n + " fahrenheit is " + c + " celsius");
                
                break;
            }
            
            case 8:
            {
                double f = (n * 1.8) + 32;
                
                JOptionPane.showMessageDialog(null, n + " celsius is " + f + " fahrenheit");
                
                break;
            }
            
            default:
                
                JOptionPane.showMessageDialog(null, "Invlaid");
                
                break;
        }
        
        System.exit(0);
    }
}
