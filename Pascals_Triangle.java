import java.util.List;
import java.util.ArrayList;

public class Pascals_Triangle {
    public static List<List<Integer>> check(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> previous = res.get(res.size() - 1);
            List<Integer> temp = new ArrayList<>();
            temp.add(0);

            for (int j = 0; j < previous.size(); j++) {
                temp.add(previous.get(j));
            }

            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < temp.size() - 1; j++) {
                row.add(temp.get(j) + temp.get(j + 1));
            }
            res.add(row);
        }
        return res;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = check(numRows);
        System.out.println(result);
    }
}
