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
public class FactorialTailed {
    public int factorial(int n,int result){
        if(n==1)
            return result;
        else
            return factorial(n-1,n*result);
    }
    public static void main(String[] args){
        int result=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        FactorialTailed fact=new FactorialTailed();
        result=fact.factorial(n, result);
        System.out.println("Factorial is"+result);
        
        
    }
           
    
}
