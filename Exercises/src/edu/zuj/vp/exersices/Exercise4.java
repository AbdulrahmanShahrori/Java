package edu.zuj.vp.exersices;

import java.util.Scanner;

public class Exercise4 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("How many stars do you want to print? ");
        
        int n = input.nextInt();
        
        System.out.println("\nPrinting stars horizontally:");
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("* ");
        }
        
        System.out.println("\nPrinting stars in a square:");
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                System.out.print("* ");
                
            }
            
            System.out.println("*");
        }
        
        System.out.println("\nPrinting stars in a triangle");
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i; j++) {
                
                System.out.print("* ");
            }
            
            System.out.println("* ");
        }
        
        System.out.println("\nPrinting stars in a reverse triangle");
        
        for (int i = 0; i < n; i++) {
            
            for (int j = n; j > 0; j--)
            {
                if(j > i)
                {
                    System.out.print(" ");
                }
                
                else
                {
                    System.out.print("*");
                }
            }
                
            System.out.println();
        }
        
        System.out.println("\nPrinting stars in a pyramid");
        
        for (int i = 0; i < n; i++) {
            
            for (int j = n; j > 0; j--)
            {
                if(j > i)
                {
                    System.out.print(" ");
                }
                
                else
                {
                    System.out.print("* ");
                }
            }
                
            System.out.println();
        }
        
        System.out.println("\nPrinting stars in a diamond");
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i; j++) {
                
                System.out.print(" ");
            }
            
            for (int k = 0; k < i * 2 - 1; k++) {
                
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for (int i = (n - 1); i > 0; i--) {
            
            for (int j = 0; j < n - i; j++) {
                
                System.out.print(" ");
            }
            
            for (int k = 0; k < i * 2 - 1; k++) {
                
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}