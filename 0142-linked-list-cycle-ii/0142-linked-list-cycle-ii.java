/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashMap = new HashSet<ListNode>();
        while(head != null){
            if(!hashMap.contains(head)){
                hashMap.add(head);
                head = head.next;
            }
            else{
                return head;
            }
        }
        return null;
    }
}