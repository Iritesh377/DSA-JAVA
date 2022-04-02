/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CircularLinkedList;

/**
 *
 * @author RITX
 */
public class SingleCircularLinkedList {
     public Node head, tail;
   public void addNodeLast(int data){
       Node newNode=new Node(data);
       if(head==null){
           newNode.nextNode=newNode;
           head=newNode;
           tail=newNode;
       }
       else{
           tail.nextNode=newNode;
           tail=newNode;
           tail.nextNode=head;
       }
   }
   public void addNodeFirst(int data){
       Node newNode=new Node(data);
       if(head==null){
           newNode.nextNode=newNode;
           head=newNode;
           tail=newNode;
       }
       else{
           newNode.nextNode=head;
           head=newNode;
           tail.nextNode=head;
       }
   }
   public void deleteFirst(){
    if(head==null){
    System.out.println("list is empty");
}
    else{
        if(head!=tail){
            Node current=head;
            head=current.nextNode;
            current.nextNode=null;
            tail.nextNode=head;
        }
        else{
    head=tail=null;
}}}
    public void deleteLast(){
    if(head==null){
    System.out.println("list is empty");
}
    else{
        if(head!=tail){
            Node current=head;
            while(current.nextNode!=tail){
                current=current.nextNode;
            }
            tail=current;
            tail.nextNode=head;
        }
        else{
    head=tail=null;
}}}
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        else{
         System.out.println("Node of Single circular linked List:");

        do{
           System.out.print(current.data+" ");
            current=current.nextNode;}
            while(current!=head);
            }
        System.out.println();
   } 
public static void main(String[] args){
SingleCircularLinkedList S= new SingleCircularLinkedList();
S.addNodeLast(12);
S.addNodeLast(24);
S.addNodeLast(33);
S.display();
S.addNodeFirst(14);
S.addNodeFirst(10);
S.display();
S.deleteFirst();
S.display();
S.deleteLast();
S.display();

}
}
