import common.ListNode;

import java.util.ArrayList;
import java.util.List;

class ReorderList {

    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            ListNode left = list.get(i);
            ListNode right = list.get(j);
            right.next = left.next.next;
            left.next = right;
            i++;
            j--;
            if (i > j) {

            }
        }
    }
}

//
