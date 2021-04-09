package datastructures.queue;

import java.util.NoSuchElementException;

public class Queue<T> {
    QueueNode<T> firstNode;
    QueueNode<T> lastNode;

    public void add(T item){
        QueueNode<T> node = new QueueNode<T>(item);
        if (lastNode != null){
            lastNode.next = node;
        }

        if (firstNode == null)
            firstNode = lastNode;
    }

    public T remove(){
        if (firstNode == null){throw new NoSuchElementException();} 
        T returnData = firstNode.data;
        firstNode = firstNode.next;
        if(firstNode == null){
            lastNode = null;
        }
        
        return returnData;
    }

    public T peek(){
        if (firstNode == null){
            throw new NoSuchElementException();
        }
        return firstNode.data;
    }

    public boolean isEmpty(){
        return firstNode == null;
    }
}


