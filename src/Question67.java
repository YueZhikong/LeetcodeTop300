public class Question67 {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int p = a.length() - 1;
        int q = b.length() - 1;
        int weight = 0;
        while (p >= 0 && q >= 0) {
            int temp_a = a.charAt(p) == '1' ? 1 : 0;
            int temp_b = b.charAt(q) == '1' ? 1 : 0;
            str.append((temp_a + temp_b + weight) % 2);
            weight = (temp_a + temp_b + weight) / 2;
            p--;
            q--;
        }
        while (p >= 0) {
            int temp = a.charAt(p) == '1' ? 1 : 0;
            str.append((temp + weight) % 2);
            weight = (temp + weight) / 2;
            p--;
        }
        while (q >= 0) {
            int temp = b.charAt(q) == '1' ? 1 : 0;
            str.append((temp + weight) % 2);
            weight = (temp + weight) / 2;
            q--;
        }
        if (weight != 0) {
            str.append(weight);
        }
        str.reverse();
        return str.toString();
    }
}
