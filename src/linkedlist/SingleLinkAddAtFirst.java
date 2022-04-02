/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author RITX
 */
public class SingleLinkAddAtFirst {
    public Node head,tail;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            
        }
        else{
            tail.nextNode=newNode;
            tail=newNode;
            
        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Nodes of singly linked list:");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.nextNode;
            
        }
        System.out.println();
    }
    
    public void addNodeFirst(int data){
       Node newNode=new Node(data);
       if(head==null){
           head=newNode;
           tail=newNode;
       }
       else{
           newNode.nextNode=head;
           head=newNode;
       }
    }
    public static void main(String[]args){
        SingleLinkAddAtFirst s= new SingleLinkAddAtFirst();
        s.addNode(12);
        s.addNode(34);
        s.addNode(10);
        s.addNode(38);
        s.addNode(19);
        s.addNode(94);
        s.addNodeFirst(99);
      
        s.display();
        
    }
}

    
