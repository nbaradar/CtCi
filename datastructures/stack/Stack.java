/**
 * This will be the stack data structure that will hold references to all the nodes and provide methods to manipulate the data.
 * @author nader
 */
package datastructures.stack;

import java.util.EmptyStackException;

public class Stack<T> {
    StackNode<T> top;

    public T pop(){
        if (top == null){
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item){
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
    }
    
    public T peek(){
        if (top==null){throw new EmptyStackException();}
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
