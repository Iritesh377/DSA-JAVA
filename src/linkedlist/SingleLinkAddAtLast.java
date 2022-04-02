/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Administrator
 */
public class SingleLinkAddAtLast{
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
    

    public static void main(String[]args){
        SingleLinkAddAtLast s= new SingleLinkAddAtLast();
        s.addNode(12);
        s.addNode(34);
        s.addNode(10);
        s.addNode(38);
        s.addNode(19);
        s.addNode(94);
      
        
        s.display();
        
    }
}
