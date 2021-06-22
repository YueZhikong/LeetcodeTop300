public class Question69 {
    public int mySqrt(int x) {
        if (x==0){
            return 0;
        }
        if (x<1){
            return 1;
        }
        long left = 0;
        long right = x;
        long temp = x/2;
        while (true){
            if (temp*temp<x){
                left = temp;
                temp = (temp+right)/2;
            }else if(temp*temp==x){
                return (int)temp;
            }else {
                if ((temp-1)*(temp-1)<x&&temp*temp>x){
                    return (int)(temp-1);
                }else {
                    right = temp;
                    temp = (temp+left)/2;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Question69().mySqrt(8));
    }
}
