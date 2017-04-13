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

    public ListNode<T> get(int n) {
        if (n == 1) {
            return this;
        } else if (n < 1) {
            return null;
        } else if (this.next == null){
            throw new RuntimeException("Index out of bounds.");
        } else {
            return this.next.get(--n);
        }
    }

    public int length() {
        ListNode<T> node = this;
        int len = 1;
        while (node.next != null) {
            node = node.next;
            ++len;
        }
        return len;
    }


    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
