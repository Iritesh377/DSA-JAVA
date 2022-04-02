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
public class PowerTailed {
    public int power(int num,int pow,int res){
        if(pow==0)
            return res;
        else
            return power(num,pow-1,res*num);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number and its power");
        int num=in.nextInt();
        int pow=in.nextInt();
        PowerTailed p=new PowerTailed();
        int res=p.power(num,pow,1);
        System.out.println("Result is "+res);
    }
    
}
