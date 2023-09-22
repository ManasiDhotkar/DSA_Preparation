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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode curr = new ListNode();
        ListNode temp = curr;
        while(l1 != null || l2 != null){
          
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;

            sum = l1Val + l2Val + carry ;

            if(sum >= 10){
                carry = sum /10;
                sum = sum % 10;
            }
            else {
                carry = 0;
            }
            curr.next  = new ListNode(sum);
            curr = curr.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next: null;
        }

        if(carry != 0){
            curr.next = new ListNode(carry);
        }

        return temp.next;
    }
}