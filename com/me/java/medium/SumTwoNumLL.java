/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode outList = null;
        ListNode root = null ;
        int carryOver = 0;
        while(l1 != null  || l2!= null || carryOver > 0){
            
            int num = 0 ; 
            num = num + carryOver; 
            if(l1 != null){
                num =num + l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null ){
                num = num + l2.val ;
                l2 = l2.next;
            }
         
            carryOver = num / 10;
            num = num%10;

            if(outList == null){
                outList = new ListNode(num);
                root = outList ;
            }else {
                ListNode node = new ListNode(num);
                outList.next = node ;                         
                outList =  outList.next;
            }
                  
            
        }
        return root ; 
    }
}
