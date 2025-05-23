package common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ListNode a = this, b = (ListNode) obj;

        while (a != null && b != null) {
            if (a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }

    @Override
    public int hashCode() {
        int result = 1;
        ListNode current = this;
        while (current != null) {
            result = 31 * result + current.val;
            current = current.next;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;
        sb.append("[");
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
