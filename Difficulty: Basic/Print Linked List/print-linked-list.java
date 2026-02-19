class Solution {
    public ArrayList<Integer> printList(Node head) {

        ArrayList<Integer> list = new ArrayList<>();

        Node curr = head;

        while (curr != null) {
            list.add(curr.data);
            curr = curr.next;
        }

        return list;
    }
}
