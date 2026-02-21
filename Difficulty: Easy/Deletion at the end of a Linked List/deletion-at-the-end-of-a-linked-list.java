/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {

        if (head == null || head.next == null)
            return null;        

        Node curr = head;

        while (curr.next.next != null) {
            curr = curr.next;  
        }

        curr.next = null;   
        return head;
    }
}