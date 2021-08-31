public class Question167 {
    public int[] twoSum(int[] numbers, int target) {
        int p = 0;
        int q = numbers.length-1;
        while (p<q){
            if (numbers[p]+numbers[q]==target){
                return new int[]{p+1,q+1};
            }else if (numbers[p]+numbers[q]<target){
                p++;
            }else {
                q--;
            }
        }
        return new int[]{};
    }
}
