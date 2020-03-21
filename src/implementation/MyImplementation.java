/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 2:34 PM
 */
package implementation;

import stack.MyStack;
import stack.Node;

import java.util.Random;

public class MyImplementation {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.peek();//stack underflow
        stack.pop();//stack underflow
        System.out.println("Size of stack = "+stack.size());//Size of stack = 0
        System.out.println("Head = "+stack.head);
        stack.push('A');
        System.out.println("Head = "+stack.head.getData());
        Node element = stack.peek();
        System.out.println("Peek: "+element.getData());
        System.out.println("Size of stack = "+stack.size());

        for (int i = 66; i <91 ; i++) {
            //stack.push((char)new Random().nextInt(100));
            stack.push((char)i);
            System.out.println("Head = "+stack.head.getData());
        }
        System.out.println("Size of stack = "+stack.size());
        System.out.println("Now Popping !!!");
        for (int i = 0; i <26 ; i++) {
            Node deleted = stack.pop();
            if(deleted !=null)
            System.out.print(deleted.getData() + ",");
        }
    }
}
