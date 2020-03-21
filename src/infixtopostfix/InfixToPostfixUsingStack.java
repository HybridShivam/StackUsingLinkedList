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
        System.out.println("Enter the expression:");
        //Enter like a+b+c*(e+f)
        String expression = sc.nextLine();
        System.out.println("Postfix Expression is: "+convertToPostFix(expression));
    }
    public static String convertToPostFix(String expression){
        String response = "";
        MyStack stack = new MyStack();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                response += c;

                // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);

                //  If the scanned character is an ')', pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek().getData() != '(')
                    response += stack.pop().getData();

                if (!stack.isEmpty() && stack.peek().getData() != '(')
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Precedence(c) <= Precedence(stack.peek().getData())){
                    if(stack.peek().getData() == '(')
                        return "Invalid Expression";
                    response += stack.pop().getData();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek().getData() == '(')
                return "Invalid Expression";
            response += stack.pop().getData();
        }
        return response;
    }
    //Returns the precedence of the char
    static int Precedence(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}