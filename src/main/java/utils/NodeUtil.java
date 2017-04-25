package utils;

import datastructures.PostingListNode;

import java.util.stream.IntStream;

public class NodeUtil {

    public static PostingListNode<Integer> createPostingList(int n) {
        PostingListNode<Integer> dummyHead = new PostingListNode<Integer>(null);
        PostingListNode<Integer> list = dummyHead;
        for (Integer i : IntStream.range(0,n).toArray()) {
            list.next = new PostingListNode<Integer>(i);
            list = list.next;
        }
        return dummyHead.next;
    }


}
