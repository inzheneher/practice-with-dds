package common;

public class ListNodeBuilder {

    /**
     * Builds a singly linked list from an array of integers.
     * Example: [1, 2, 3] builds the list: 1 -> 2 -> 3
     */
    public static ListNode buildList(int[] values) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }
}
