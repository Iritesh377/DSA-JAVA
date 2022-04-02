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
public class PowerNonTailed {
    public int power(int num,int pow){
        if(pow==0)
            return 1;
        else
            return num*power(num,pow-1);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number and its power");
        int num=in.nextInt();
        int pow=in.nextInt();
        PowerNonTailed p=new PowerNonTailed();
        int result=p.power(num, pow);
        System.out.println("Result is"+result);
    }
    
}
