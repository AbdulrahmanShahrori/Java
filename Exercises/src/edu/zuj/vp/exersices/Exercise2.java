package edu.zuj.vp.exersices;

import javax.swing.JOptionPane;

public class Exercise2 {
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number"));
        
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number"));
        
        int sum = a + b;
        
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
        
        System.exit(0);
    }
}
