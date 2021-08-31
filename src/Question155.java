import java.util.Stack;

public class Question155 {
    //效率貌似有点低啊
    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> stack_min;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            stack_min = new Stack<>();
        }

        public void push(int val) {
            if (stack_min.size()==0){
                stack_min.push(val);
            }else {
                if (val<=stack_min.peek()){
                    stack_min.push(val);
                }
            }
            stack.push(val);
        }

        public void pop() {
            if (stack_min.peek().equals(stack.peek())){
                stack_min.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return stack_min.peek();
        }
    }
}
