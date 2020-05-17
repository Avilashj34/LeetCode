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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;
        while(even!=null && even.next!=null){ 
            odd.next = even.next;
            System.out.println("1st "+even.val+" "+odd.val);
            odd = odd.next;
            System.out.println("2nd "+even.val+" "+odd.val);
            even.next = odd.next;
            System.out.println("3rd "+even.val+" "+odd.val);
            even = even.next;
            //System.out.println("4th "+even.val+" "+odd.val);
        }
        odd.next = evenhead;
        return head;
    }
}


I/p : - [1,2,3,4,5]
O/P :- [1,3,5,2,4]