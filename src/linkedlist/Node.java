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
public class Node {
    int data;
    Node nextNode;
    
    public Node(){
        data=0;
        nextNode=null;
        
    }
        public Node(int data){
            this.data=data;
            nextNode=null;
        }
}


