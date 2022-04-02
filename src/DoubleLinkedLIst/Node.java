/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkedLIst;

/**
 *
 * @author RITX
 */
public class Node {
    int data;
    Node nextNode;
    Node previousNode;
    public Node(){
        data=0;
        nextNode=null;
        previousNode=null;
        
    }
    public Node(int data){
        this.data=data;
        nextNode=null;
        previousNode=null;
    }
    
}
