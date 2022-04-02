/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackQueue;

/**
 *
 * @author RITX
 */
public class QueueArrayImp {
    private int front,rear;
    private int[] elements;
    public QueueArrayImp(int data){
        this.front= -1;
        this.rear= -1;
        this.elements=new int[data];
    }
    public boolean isEmpty(){
        if(front==-1|| front>rear){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(front==0&& rear==(elements.length-1)){
            return true;
        }
        return false;
    }
    public void peek(){
        if(!isEmpty()){
            System.out.println(elements[front]+"is peeked");
        }else{
            System.out.println("Queue is Empty");
        }
            
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full."+data+"cannot be added");
        }else{
            if(front==-1){
                front++;
            }
            rear++;
            elements[rear]=data;
            System.out.println(elements[rear]+"is added in queue");
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            int deletedData=elements[front];
            System.out.println(deletedData+"is removed");
            front++;
            if(front>rear){
                front=-1;
                rear=-1;
            }
        }
    }
    public void display(){
        System.out.println("\nDisplaying data\n********************");
        if(!isEmpty()){
            for(int i=front;i<=rear;i++){
                System.out.println(elements[i]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        QueueArrayImp queue=new QueueArrayImp(4);
        System.out.println("Is queue empty ?"+queue.isEmpty());
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(135);
        queue.peek();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(135);
        queue.display();
        
        
        
        
    }
    
}
