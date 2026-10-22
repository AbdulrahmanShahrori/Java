package edu.zuj.vp.exersices;

import java.util.Scanner;

public class Exersice1 {
    
    static Scanner input = new Scanner(System.in);
    
    public static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        
        for (int i = 2; i < n; i++) {
            
            if(n % i == 0)
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        int a = 3;
        
        int b = 4;
        
        System.out.println("The greater number is: " + Math.max(a, b));
        
        System.out.print("How many iterations do you want? ");
        
        int n = input.nextInt();
        
        int sum = 0;
        
        double avg;
        
        for (int i = 0; i <= n; i++) {
            
            sum += i;
        }
        
        avg = (double)sum/n;
        
        System.out.println("The sum is: " + sum);
        
        System.out.println("The average is: " + avg);
        
        System.out.println("Printing even numbers:");
        
        for (int i = 1; i <= n; i++) {
            
            if(i % 2 == 0)
                System.out.println(i);
        }
        
        System.out.println("Printing odd numbers:");
        
        for (int i = 1; i <= n; i++) {
            
            if(i % 2 == 1)
                System.out.println(i);
        }
        
        System.out.println("Printing prime numbers:");
        
        for (int i = 2; i <= n; i++) {
            
            if(isPrime(i))
                System.out.println(i);
        }
    }
}
