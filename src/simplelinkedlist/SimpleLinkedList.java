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
public class SimpleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SLinkedList lista = new SLinkedList();
        
        lista.PushFront("Hola");
        lista.PushFront(2);
        lista.PushFront(2.16);
        lista.ImprimirLista();
    }
    
}
