/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author wesle
 */
public class Stack<T> {
    private Node<T> top;
    private int quantity;
    
    public Stack(){
        this.top=null;
    }
    public void push(T data){
        Node<T> newNode=new Node(data);
        if(this.top!=null){
            newNode.setProx(top);
            this.top=newNode;
        }
        else
            this.top=newNode;
         this.quantity++;
    }
    public Node<T> pop(){
       if(top!=null){
           Node<T> aux=top;
           this.top=top.getProx();
           return aux;
       }
       else{
           System.out.println("Empty Stack");
           return null;
       }     
    }
    public void printStack(){
        if(top!=null){
            Node<T> aux=top;
            while(aux!=null){
                System.out.println(aux.getData());
                aux=aux.getProx();
            }
        }
        else
            System.out.println("Empty Stack");
    }
    public void printTop(){
        if(top!=null){
            System.out.println(this.top.getData());
        }
        else
            System.out.println("Empty Stack");
    }
    public int elementsQuantity(){
        
        return this.quantity;
    }
}
