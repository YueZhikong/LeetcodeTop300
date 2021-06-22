public class Question141 {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return false;
        }
        ListNode p = head;
        ListNode q = head;
        while (p.next!=null&&q.next!=null&&q.next.next!=null){
            p=p.next;
            q= q.next.next;
            if (p==q){
                return true;
            }
        }
        return false;
    }
}
