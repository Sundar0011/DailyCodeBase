
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> list=new HashSet<>();
        ListNode curr=headA;
        while(true){
            if(curr==null)
                break;
            list.add(curr);
            curr=curr.next;    
        }
        curr=headB;
        while(true){
            if(curr==null)
                break;
            if(list.contains(curr)==true){
                return curr;
            }    
            curr=curr.next;
        }
        return null;
    }
}
