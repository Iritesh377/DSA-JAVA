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
public class SumNaturalTail {
    public int sum(int n,int res){
        if(n==0)
            return res;
        else{
            return sum(n-1,res+n);
        }
        
    }
    public static void main(String[] args){
        int res=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=in.nextInt();
        SumNaturalTail s= new SumNaturalTail();
        res=s.sum(n, res);
        System.out.println("Result:"+res);
        
    }
    
}
