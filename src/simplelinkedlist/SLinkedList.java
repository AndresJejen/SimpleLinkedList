/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelinkedlist;

/**
 *
 * @author gjejen
 */
public class SLinkedList {
    
    //Campos protegidos
    protected Node head;
    protected Node tail;
 
    //Encapsulamiento
    
    
    //Constructor
    public SLinkedList(){
        head = null;
        tail = null;
    }
    
    //Métodos
    public void PushFront(Object o){

        Node tmp = new Node(o, null);
        tmp.setNext(head);
        head = tmp;
       
    }
    
    
    
}
