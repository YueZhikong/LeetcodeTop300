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
}