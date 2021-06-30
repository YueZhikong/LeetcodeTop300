import java.util.ArrayList;
import java.util.List;

public class Question17 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        dig(result,digits,0,"");
        return result;
    }
    private void  dig(List<String> result,String digits,int i,String half){
        if(i>=digits.length()){
            result.add(half);
            return;
        }
        if(digits.charAt(i)=='2'){
            i = i +1;
            dig(result,digits,i,half+"a");
            dig(result,digits,i,half+"b");
            dig(result,digits,i,half+"c");
        }else if(digits.charAt(i)=='3'){
            i = i +1;
            dig(result,digits,i,half+"d");
            dig(result,digits,i,half+"e");
            dig(result,digits,i,half+"f");
        }else if(digits.charAt(i)=='4'){
            i = i +1;
            dig(result,digits,i,half+"g");
            dig(result,digits,i,half+"h");
            dig(result,digits,i,half+"i");
        }else if(digits.charAt(i)=='5'){
            i = i +1;
            dig(result,digits,i,half+"j");
            dig(result,digits,i,half+"k");
            dig(result,digits,i,half+"l");
        }else if(digits.charAt(i)=='6'){
            i = i +1;
            dig(result,digits,i,half+"m");
            dig(result,digits,i,half+"n");
            dig(result,digits,i,half+"o");
        }else if(digits.charAt(i)=='7'){
            i = i +1;
            dig(result,digits,i,half+"p");
            dig(result,digits,i,half+"q");
            dig(result,digits,i,half+"r");
            dig(result,digits,i,half+"r");
        }else if(digits.charAt(i)=='8'){
            i = i +1;
            dig(result,digits,i,half+"t");
            dig(result,digits,i,half+"u");
            dig(result,digits,i,half+"v");
        }else if(digits.charAt(i)=='9'){
            i = i +1;
            dig(result,digits,i,half+"w");
            dig(result,digits,i,half+"x");
            dig(result,digits,i,half+"y");
            dig(result,digits,i,half+"z");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Question17().letterCombinations("23"));
    }
}
