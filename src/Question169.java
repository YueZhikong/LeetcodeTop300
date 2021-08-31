import java.util.HashMap;
import java.util.Map;

public class Question169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.get(nums[i])==null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
                if (map.get(nums[i])>nums.length/2){
                    return nums[i];
                }
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(new Question169().majorityElement(nums));
    }
}
