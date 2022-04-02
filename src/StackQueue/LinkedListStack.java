/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackQueue;

/**
 *
 * @author RITX
 */
public class LinkedListStack {
    Node top;
    public boolean isEmpty(){
        return(top==null);
    }
    public boolean isFull(Node n){
        return(n==null);
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(isFull(newNode)){
            System.out.println("Heap overflown");
        }
        if(isEmpty()){
            top=newNode;
            System.out.println(top.data+ "is pushed");
        }else{
            newNode.nextNode=top;
            top=newNode;
            System.out.println(top.data+ "is pushed");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("No node on the stack");
        }
        else{
            Node popNode=top;
            top=popNode.nextNode;
            System.out.println(popNode.data+"is poped");
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("No node available on the stack");
        }
        else{
            System.out.println(top.data+ "is peeked");
        }
    }
    public void display(){
        if(!isEmpty()){
            Node n=top;
            System.out.println("\n Displaying data");
            System.out.println("*********************");
            while(n!=null){
                System.out.println(n.data);
                n=n.nextNode;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
       LinkedListStack stack= new LinkedListStack();
       System.out.println("Is Stack Empty?"+ stack.isEmpty());
       stack.push(12);
       stack.peek();
       stack.push(13);
       stack.push(15);
       stack.push(17);
       stack.display();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
    }
    
}
