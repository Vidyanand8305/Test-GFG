/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        if (head == null) return head;

        int zero = 0, one = 0, two = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data == 0) zero++;
            else if (curr.data == 1) one++;
            else two++;
            curr = curr.next;
        }
        curr = head;

        while (zero-- > 0) {
            curr.data = 0;
            curr = curr.next;
        }

        while (one-- > 0) {
            curr.data = 1;
            curr = curr.next;
        }

        while (two-- > 0) {
            curr.data = 2;
            curr = curr.next;
        }

        return head;
    }
}