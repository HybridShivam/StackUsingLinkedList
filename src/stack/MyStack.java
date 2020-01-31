/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 2:13 PM
 */
package stack;

public class MyStack {
    //top of stack
    Node head;
    //number of elements in stack
    int size;

    public MyStack() {
        head = null;
        size = 0;
    }
    // isEmpty() to check stack  for zero elements
    public boolean isEmpty(){
        boolean response = false;
        if(head == null){
            response = true;
        }
        return response;
    }
    // insert at beginning
    public void push(int element){
        Node node = new Node(element);
        node.setNext(head);
        head = node;
        size++;

    }
    //delete from beginning
    public Node pop(){
        Node response = null;
        if(!isEmpty()){
            response = head;
            size--;
            head = head.getNext();
        }
        else{
            System.out.println("stack underflow");
        }
        return response;
    }
    public int size(){
        return size;
    }
    public Node peek(){
        Node response = null;
        if(!isEmpty()){
            response = head;
        }
        else{
            System.out.println("stack under flow");
        }
        return  response;
    }
}
