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
public class SumNaturalNonTailed {
    public int sum(int n){
        if(n==1)
            return 1;
        else{
            return n+sum(n-1);
        }
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        SumNaturalNonTailed s= new SumNaturalNonTailed();
       int result=s.sum(n);
        System.out.println("Result:"+ result);
        
    }
    
    
}
