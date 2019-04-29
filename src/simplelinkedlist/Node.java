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
public class Node {
    
    //Campos
    private Object info;
    private Node next;
    
    //Constructor
    public Node(){
        info = null;
        next = null;
    }
    
    public Node(Object o, Node n){
        setInfo(o);
        setNext(n);
    }
    
    //Encapsulamiento
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
