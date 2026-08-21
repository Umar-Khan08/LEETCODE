/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int data;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(-1);
        temp1=l1;temp2=l2;
        int carry=0,sum=0;
        ListNode current=dummy;
        while (temp1!=null || temp2!=null || carry!=0)
        { 
            sum=carry;
            if(temp1!=null) sum=sum+temp1.val;
            if(temp2!=null) sum=sum+temp2.val;
            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            current.next=newnode;
            current=current.next;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        } if(carry!=0)
        {
            ListNode newnode=new ListNode(carry);
            current.next=newnode;
        } return dummy.next;
    }
}