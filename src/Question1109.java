public class Question1109 {
    //暴力法
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for (int i = 0;i <bookings.length;i++){
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seat = bookings[i][2];
            for(int j = first-1;j <= last-1;j++){
                result[j] = result[j] + seat;
            }
        }
        return result;
    }

    //todo 差分？前缀和？
}
