package datastructures;

public class ListNode<T> {

    public T data;
    public ListNode<T> next;

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(T data) {
        this.data = data;
    }

    public ListNode<T> find(int n) {
        if (n == 1) {
            return this;
        } else if (n < 1) {
            return null;
        } else if (this.next == null){
            throw new RuntimeException("Index out of bounds.");
        } else {
            return this.next.find(--n);
        }
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public boolean equals(ListNode<T> node) {
        if (node != null
                && this.data == node.data) {
            return this.next == node.next;
        }
        return false;
    }


}
