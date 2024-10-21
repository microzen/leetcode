import java.util.ArrayList;
import java.util.List;

public class DiffWaysToAddParentheses {
    List<Integer> numbers = new ArrayList<>();
    List<Character> operators = new ArrayList<>();
    public List<Integer> diffWaysToCompute(String expression) {

        StringBuilder builder = new StringBuilder(expression);
        int index = 0;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '+' || builder.charAt(i) == '-' || builder.charAt(i) == '*') {
                numbers.add(Integer.parseInt(builder.substring(index, i)));
                operators.add(builder.charAt(i));
                index = i + 1;
            }
        }
        numbers.add(Integer.parseInt(builder.substring(index, builder.length())));
        return numbers;
    }

    void merge() {

    }
    void mergeSort(int start, int end) {
        if (Math.abs(start - end) <- 1) {
//            return numbers[start];
        }
        mergeSort(start + 1, end);
        for (int i = start; i <= end; i++) {

        }
    }
}
