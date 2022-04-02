/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkedLIst;

/**
 *
 * @author RITX
 */
public class DoubleLinkedList {
    public Node head,tail;
    public void addNodeLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.nextNode=newNode;
            newNode.previousNode=tail;
            tail=newNode;
        }
    }
    public void addNodeFirst(int data){
    Node newNode= new Node(data);
    if(head==null){
    head=newNode;
    tail=newNode;
}
    else{
    head.previousNode=newNode;
    newNode.nextNode=head;
    head=newNode;
}}
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
            tail.nextNode=null;
        }
        else{
    head=tail=null;
}}}
    public void deleteFirst(){
    if(head==null){
    System.out.println("list is empty");
}
    else{
        if(head!=tail){
            Node current=head;
            head=current.nextNode;
            current.nextNode=null;
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
        System.out.println("Node of DoubleLinked List:");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.nextNode;
    }
    System.out.println();
}
public static void main(String[] args){
DoubleLinkedList D= new DoubleLinkedList();
D.addNodeLast(12);
D.addNodeLast(13);
D.addNodeLast(14);
D.display();
D.addNodeFirst(99);
D.addNodeFirst(98);
D.display();
D.deleteFirst();
D.display();
D.deleteLast();
D.display();
}}
