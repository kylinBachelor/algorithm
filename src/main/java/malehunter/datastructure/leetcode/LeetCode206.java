package malehunter.datastructure.leetcode;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/17
 * @describe： 给你单链表的头节点 head ，请反转链表，并返回反转后的链表。
 */

public class LeetCode206 {
    public static ListNode reverseList1(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = head;
            head = curr;
            curr = next;
        }
        return head;
    }
    public ListNode reverseList2(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       while(curr != null) {
           ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       return prev;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        ListNode listNode = reverseList1(head1);
        System.out.println(listNode);
    }
}
