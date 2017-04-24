package datastructures;

public class PostingListNode<T> {

    public T data;
    public PostingListNode<T> next;
    public PostingListNode<T> jump;

    public PostingListNode(T data) {
        this.data = data;
    }

    public PostingListNode(T data, PostingListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public PostingListNode(T data, PostingListNode<T> next, PostingListNode<T> jump) {
        this.data = data;
        this.next = next;
        this.jump = jump;
    }
}
