public class Question13 {
    public int romanToInt(String s) {

        int p = 0;
        int total = 0;
        while (p<s.length()){
            if (p+1<s.length()&&s.charAt(p)=='I'){
                if(s.charAt(p+1)=='V'){
                    total = total + 4;
                    p++;
                    p++;
                    continue;
                }
                else if (s.charAt(p+1)=='X'){
                    total = total + 9;
                    p++;
                    p++;
                    continue;
                }
            }
            else if (p+1<s.length()&&s.charAt(p)=='X'){
                if(s.charAt(p+1)=='L'){
                    total = total + 40;
                    p++;
                    p++;
                    continue;
                }
                else if (s.charAt(p+1)=='C'){
                    total = total + 90;
                    p++;
                    p++;
                    continue;
                }
            }
            else if (p+1<s.length()&&s.charAt(p)=='C'){
                if(s.charAt(p+1)=='D'){
                    total = total + 400;
                    p++;
                    p++;
                    continue;
                }
                else if (s.charAt(p+1)=='M'){
                    total = total + 900;
                    p++;
                    p++;
                    continue;
                }
            }
            if (s.charAt(p)=='I'){
                total = total + 1;
            }
            else if (s.charAt(p)=='V'){
                total = total + 5;
            }
            else if (s.charAt(p)=='X'){
                total = total + 10;
            }
            else if (s.charAt(p)=='L'){
                total = total + 50;
            }
            else if (s.charAt(p)=='C'){
                total = total + 100;
            }
            else if (s.charAt(p)=='D'){
                total = total + 500;
            }
            else if (s.charAt(p)=='M'){
                total = total + 1000;
            }
            p++;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(new Question13().romanToInt("LVIII"));
    }
}
