import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question22{
	public int removeDuplicates(int[] nums) {
		if (nums.length<2){
			return nums.length;
		}
		int p = 0;
		int length = nums.length;
		while (p<length-1){
			if (nums[p]==nums[p+1]){
				changeArrayAfterDelete(nums,p);
				length--;
			}
			else {
				p++;
			}
		}
		return length;
    }

	//删除后移动操作
	public void changeArrayAfterDelete(int[] nums,int i){
		System.arraycopy(nums,i+1,nums,i,nums.length -i-1);
	}

	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,3};
		System.out.println(new Question22().removeDuplicates(nums));
	}



	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		returnAllCombination(result,0,n,"");
		return result;
	}

	private void returnAllCombination(List<String> result, int i, int n, String str){
		if(i>=n*2){
			if(isRight(str)){
				result.add(str);
			}
			return;
		}
		i = i+1;
		returnAllCombination(result,i,n,str+"(");
		returnAllCombination(result,i,n,str+")");
	}
	private boolean isRight(String str){
		Stack<Character> stack = new Stack();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				stack.push(str.charAt(i));
			}else{
				if(stack.isEmpty()||stack.peek()!='('){
					return false;
				}else{
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		return false;
	}
}