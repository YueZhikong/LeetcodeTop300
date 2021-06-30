public class Question06 {
    public String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        char[][] arrays = new char[s.length()][numRows];
        // 0向下 1斜向上
        int direction = 0;
        //下一步的坐标
        //横坐标
        int p = 0;
        //纵坐标
        int q = 0;
        for (int i = 0; i < s.length(); i++) {
            arrays[p][q] = s.charAt(i);
            if (direction==0){
                if (q!=numRows-1){
                    q++;
                }else {
                    direction=1;
                    p++;
                    q--;
                }
            } else {
                if (q!=0){
                    p++;
                    q--;
                }else {
                    direction=0;
                    q++;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <arrays[0].length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (arrays[j][i]!='\u0000'){
                    result.append(arrays[j][i]);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Question06().convert("PAYPALISHIRING",3));
    }
}
