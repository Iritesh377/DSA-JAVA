/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackQueue;

/**
 *
 * @author RITX
 */
public class QueueLinkedListImp1 {
    Node front,rear;
    public boolean isEmpty(){
        return(front==null||rear==null);
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(rear==null){
            rear=newNode;
            front=rear;
        }else{
            rear.nextNode=newNode;
            rear=newNode;
        }
        System.out.println(rear.data+"is added in queue");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Node temp=front;
            front=front.nextNode;
            if(front==null){
                rear=null;
            }
            System.out.println(temp.data+"is removed from queue");
        }
    }
    public void display(){
        System.out.println("\nDisplaying Queue \n******************");
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Node temp;
            for(temp=front;temp!=rear;temp=temp.nextNode){
                System.out.print(temp.data+"-->");
            }
            System.out.print(temp.data+"\n\n");
        }
    }
    public static void main(String[] args){
        QueueLinkedListImp1 queue =new QueueLinkedListImp1();
        queue.enqueue(124);
        queue.enqueue(123);
        queue.enqueue(12232);
        queue.enqueue(1);
        queue.display();
        queue.dequeue();
        queue.display();
        
    }
}
