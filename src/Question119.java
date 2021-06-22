import java.util.ArrayList;
import java.util.List;

public class Question119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            if (i==0){
                temp.add(1);
                result.add(temp);
            } else if (i==1){
                temp.add(1);
                temp.add(1);
                result.add(temp);
            }else {
                temp.add(1);
                for (int j = 1; j < i; j++) {
                    temp.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
                temp.add(1);
                result.add(temp);
            }
        }
        return result.get(rowIndex);
    }
}
