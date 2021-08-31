public class Question168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        int n=columnNumber-1;
        while (n/26!=0){
            str.append((char) ((n%26)+(int) 'A'));
            n = n/26-1;
        }
        str.append((char) (n+(int) 'A'));
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Question168().convertToTitle(701));
    }
}
