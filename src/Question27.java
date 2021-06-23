public class Question27 {
    //暴力，不过奇怪的是耗时少，耗内存倒是很多
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        while (i<length){
            if (nums[i]==val){
                for (int j=i;j<length-1;j++){
                    swap(nums,j,j+1);
                }
                length--;
            }
            else {
                i++;
            }
        }
        return length;
    }
    private void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
