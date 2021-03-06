import java.util.Arrays;

public class Question31 {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i=nums.length-1;i>0;i--){
            if (nums[i-1]<nums[i]){
                index =i-1;
                break;
            }
        }
        if (index ==-1){
            Arrays.sort(nums);
        }else {
            int min_index = index+1;
            for (int i=index+1;i<nums.length;i++){
                if (nums[i]<nums[min_index]&&nums[i]>nums[index]){
                    min_index = i;
                }
            }
            swap(nums,index,min_index);
            Arrays.sort(nums,index+1,nums.length);
        }
    }
    public  void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
