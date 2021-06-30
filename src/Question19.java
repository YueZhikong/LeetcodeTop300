import java.util.Stack;

public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack();
        ListNode p = head;
        ListNode q = head;
        ListNode h = head;
        int step = 0;
        while(step<n){
            p = p.next;
            step++;
        }
        while(p!=null){
            p = p.next;
            stack.push(q);
            q = q.next;
        }
        if(stack.isEmpty()){
            return q.next;
        }
        stack.peek().next = q.next;
        return h;
    }
}
