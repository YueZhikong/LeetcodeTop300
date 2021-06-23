public class Question191 {
    public int hammingWeight(int n) {
        String str =Integer.toBinaryString(n);
        int i = 0;
        for (int j=0;j<str.length();j++){
            if (str.charAt(j)=='1'){
                i++;
            }
        }
        return i;
    }
}
