/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackQueue;

/**
 *
 * @author RITX
 */
public class StackImp{
    int[]elements;
    int top,size;
    public StackImp(int size){
        elements=new int[size];
        top=-1;
        this.size=size;
    }
    public boolean isEmpty(){
        return(-1==top);
    }
    public boolean isFull(){
        return(top>=(size-1));
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
            elements[++top]=data;
            System.out.println(data +" "+ "is pushed");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
        }else{
            int popedElement=elements[top];
            top--;
            System.out.println(popedElement + " "+"is poped");
           
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            int popedElement=elements[top];
            System.out.println(popedElement + " "+"is peeked");
        }
    }
    public void displayData(){
        System.out.println("\nDisplaying the data");
        System.out.println("************************************");
        if(top!=-1){
            for(int i=top;i>-1;i--){
                System.out.println(elements[i]);
                
            }
        }else{
            System.out.println("Stack is Empty");
        }
        System.out.println();
    }
    public static void main(String[] args){
        StackImp a=new StackImp(12);
        a.push(1);
        a.peek();
        a.push(20);
        a.push(3);
        a.push(5);
        a.displayData();
        a.pop();
        a.pop();
        a.pop();
        a.push(45);
        a.displayData();
    }
    
}
