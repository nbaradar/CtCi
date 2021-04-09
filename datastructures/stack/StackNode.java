package datastructures.stack;

public class StackNode<T> {
    StackNode<T> next;
    T data;

    public StackNode(T data){
        this.data = data;
    }
}
