import java.util.Stack;

public class Question20{
	public boolean isValid(String s){
		if(s.length()%2!=0){
			return false;
		}
		Stack<Character> stack = new Stack();
		for(int i = 0; i<s.length();i++){
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
				stack.push(s.charAt(i));
			}
			else{
				if (stack.empty()){
					return false;
				}
				Character temp = stack.pop();
				if (s.charAt(i)==')'&&temp=='('){
					continue;
				}
				else if (s.charAt(i)==']'&&temp=='['){
					continue;
				}
				else if (s.charAt(i)=='}'&&temp=='{'){
					continue;
				}{
					return false;
				}
			}
		}
		return stack.size() == 0;
	}
}