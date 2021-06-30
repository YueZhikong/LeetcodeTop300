public class Question12{
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        while(num>=1000){
            str.append("M");
            num = num - 1000;
        }

        while(num>=900){
            str.append("CM");
            num = num - 900;
        }

        while(num>=500){
            str.append("D");
            num = num - 500;
        }

        while(num>=400){
            str.append("CD");
            num = num - 400;
        }

        while(num>=100){
            str.append("C");
            num = num - 100;
        }

        while(num>=90){
            str.append("XC");
            num = num - 90;
        }

        while(num>=50){
            str.append("L");
            num = num - 50;
        }

        while(num>=40){
            str.append("XL");
            num = num -40;
        }

        while(num>=10){
            str.append("X");
            num = num -10;
        }

        while(num>=9){
            str.append("IX");
            num =num - 9;
        }

        while(num>=5){
            str.append("V");
            num = num -5;
        }

        while(num>=4){
            str.append("IV");
            num = num - 4;
        }

        while(num>=1){
            str.append("I");
            num = num - 1;
        }
        return str.toString();
    }
}