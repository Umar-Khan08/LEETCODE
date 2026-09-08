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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int c = 0;
        ListNode temp = head;
        ListNode[] arr = new ListNode[k];
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        temp = head;
        int size = c / k;
        int extra = c % k;
        for (int i = 0; i < k; i++) {
            arr[i] = temp;
            int extSize = size;
            if (extra > 0) {
                extSize++;
                extra--;
            }
            int j = 1;
            ListNode tempp = temp;
            while (j < extSize) {
                tempp = tempp.next;
                j++;
            }
            if (tempp != null) {
                ListNode next = tempp.next;
                tempp.next = null;
                temp = next;
            }
        }
        return arr;
    }
}