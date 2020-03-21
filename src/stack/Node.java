/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 2:14 PM
 */
package stack;

public class Node {
    private Character data;
    private Node next;

    public Node(Character data) {
        this.data = data;
        next = null;
    }

    public Character getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    //getter setter


}
