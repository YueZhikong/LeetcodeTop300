public class Question02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode();
        ListNode h = head;
        int carry = (p.val + q.val)/10;
        head.val = (p.val + q.val)%10;
        while(p.next!=null||q.next!=null){
            if(p.next!=null&&q.next!=null){
                ListNode add = new ListNode();
                add.val = (p.next.val + q.next.val + carry)%10;
                carry = (p.next.val + q.next.val + carry)/10;
                h.next = add;
                h = h.next;
                p = p.next;
                q = q.next;
            }
            else if(p.next!=null&&q.next==null){
                ListNode add = new ListNode();
                add.val = (p.next.val + carry)%10;
                carry = (p.next.val + carry)/10;
                h.next = add;
                h = h.next;
                p = p.next;
            }
            else{
                ListNode add = new ListNode();
                add.val = (q.next.val + carry)%10;
                carry = (q.next.val + carry)/10;
                h.next = add;
                h = h.next;
                q = q.next;
            }
        }
        if(carry!=0){
            ListNode add = new ListNode();
            add.val = carry;
            h.next=add;
        }
        return head;
    }
}
