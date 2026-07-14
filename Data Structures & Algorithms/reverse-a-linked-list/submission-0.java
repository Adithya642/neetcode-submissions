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
    public ListNode reverseList(ListNode head) {
        List<Integer> input=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            input.add(current.val);
            current=current.next;
        }
       Collections.reverse(input);
        ListNode result=new ListNode(-1);
        ListNode temp=result;
        for(int i:input){
             temp.next=new ListNode(i);
             temp=temp.next;
        }
        return result.next;
    }
}
