import java.math.BigInteger;

public class Question172 {
    //暴力
    public int trailingZeroes(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }
        String str = bigInteger.toString();
        int result = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i)=='0'){
                result++;
            }else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Question172().trailingZeroes(7));
    }
}
