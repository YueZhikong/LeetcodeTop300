public class Question09 {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Question09().isPalindrome(121));
    }
}
