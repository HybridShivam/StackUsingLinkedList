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
        stack.peek();
        stack.pop();
        System.out.println("Size of stack = "+stack.size());
        stack.push(23);
        Node element = stack.peek();
        System.out.println(element.getData());
        System.out.println("Size of stack = "+stack.size());

        for (int i = 0; i <100 ; i++) {
            stack.push(new Random().nextInt(100));

        }
        System.out.println("Size of stack = "+stack.size());
        for (int i = 0; i <180 ; i++) {
            Node deleted = stack.pop();
            if(deleted !=null)
            System.out.print(deleted.getData() + ",");
        }
    }
}
