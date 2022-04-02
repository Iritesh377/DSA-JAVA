/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author RITX
 */
public class FactorialNonTailed {
    public int factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        FactorialNonTailed fact=new FactorialNonTailed();
       int result=fact.factorial(n);
        System.out.println("Factorial is"+result);
        
        
    }
    
    
}
