import java.util.HashMap;
public class Question01 {
//    //暴力法
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{0,0};
//    }
    public int[] twoSum(int[] nums, int target) {
        //map将nums的数存一遍，方便命中
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0; i<nums.length ; i++){
            if(map.get(target-nums[i])!=null){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        new Question01().twoSum(new int[]{3,2,4},6);
    }
}
