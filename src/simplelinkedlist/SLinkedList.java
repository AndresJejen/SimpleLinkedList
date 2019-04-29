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
        
        if (this.tail == null)
            this.tail = this.head;
    }
    
    public void ImprimirLista(){
        if(this.head == null){
            System.out.println("Lista vacia!!!");
        }
        else{
            Node p = this.head;
            while(p!= null){
                System.out.println(p.getInfo());
                p = p.getNext();
            }
        }
    }
    
    
    
    
    
    
    
}
