/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = head;
        boolean first = true;
        while(currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next;
            if(!first) {
                System.out.println(prevNode.val);
                prevNode.next = nextNode;
            }
            currNode.next = nextNode.next;
            nextNode.next = currNode;
            prevNode = currNode;
            currNode = currNode.next;
            if(first) {
                head = nextNode;
                first = false;
            }
        }
    return head;
    }
}