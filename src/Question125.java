import java.util.ArrayList;
import java.util.List;

public class Question125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)>='a' && s.charAt(i)<='z')||
                    (s.charAt(i)>='A' && s.charAt(i)<='Z')||
                    (s.charAt(i)>='0'&&s.charAt(i)<='9')
            ){
                list.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        if (list.isEmpty()){
            return false;
        }
        for (int i = 0; i <=list.size()/2; i++) {
            if (!(list.get(i).equals(list.get(list.size()-1-i)))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Question125().isPalindrome("0P"));
    }
}
