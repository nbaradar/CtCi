package datastructures.queue;

public class QueueNode<T> {
    QueueNode<T> next;
    T data;

    public QueueNode(T data){
        this.data = data;
    }
}
