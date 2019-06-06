package list.solution19;
/**
 * 从有序链表中删除重复节点
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */

import list.listnode.ListNode;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (n-- > 0) {
            fast = fast.next;
        }
        //如果fast移动n步以后等于空了，说明删除的是头节点，只需返回投节点的下一个节点
        if (fast == null) {
            return head.next;
        }
        //这里注意while循环里的判断和。一定要加上next，否则无法完成
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }

        return head;

    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.print(removeNthFromEnd(head, 2));
    }
}
