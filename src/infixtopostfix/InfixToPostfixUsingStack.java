/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 3:59 PM
 */
package infixtopostfix;

import stack.MyStack;

import java.util.Scanner;

public class InfixToPostfixUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the expression");
        String expression = sc.nextLine();
    }
    public String convertToPostFix(String expression){
        String response = "";
        MyStack stack = new MyStack();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);


        }

        return response;
    }
}
