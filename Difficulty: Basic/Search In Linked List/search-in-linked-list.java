class Solution {
    public static boolean searchLinkedList(Node head, int x) {

        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }
}
