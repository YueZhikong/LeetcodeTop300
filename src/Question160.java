import java.util.HashMap;
import java.util.Map;

public class Question160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        Map<ListNode,ListNode> map = new HashMap<>();
        while (p!=null){
            map.put(p,p);
            p = p.next;
        }
        while (q!=null){
            if (map.get(q)!=null){
                return q;
            }
            q = q.next;
        }
        return null;
    }
}
