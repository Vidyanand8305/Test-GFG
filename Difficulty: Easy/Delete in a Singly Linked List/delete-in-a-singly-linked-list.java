/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {

        if (head == null) return null;

        if (x == 1) return head.next;

        Node curr = head;

        for (int i = 1; i < x - 1 && curr.next != null; i++) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }
}