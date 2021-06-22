public class Question70 {
    public int climbStairs(int n) {
        if (n<=2){
            return n;
        }
        int pre =1;
        int next =2;
        for (int i = 3; i <= n; i++) {
            int temp = next;
            next = pre+next;
            pre = temp;
        }
        return next;
    }

}
