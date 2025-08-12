public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;      //previous node (starts as null)
        ListNode curr = head;      //current node we are  reversing

        while (curr != null) {
            ListNode nextNode = curr.next; //save next node
            curr.next = prev;              //reverse pointer
            prev = curr;                   //move prev forward
            curr = nextNode;                //move curr forward
        }

        return prev; 
    }
}
