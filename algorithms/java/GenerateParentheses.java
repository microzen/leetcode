/*
22. Generate Parentheses
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> strs = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        int right = n, left = n;
        StringBuilder sb = new StringBuilder();
        dp(sb, left, right);
        return strs;
    }
    void dp(StringBuilder sb, int left, int right) {
        if (right == 0 && left == 0) {
            strs.add(sb.toString());

        } else if (left > right) {
            return;
        } else if (left > 0) {
            dp(sb.append('('), left - 1, right);
            sb.deleteCharAt(sb.length() - 1);
        }
        dp(sb.append(')'), left, right - 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}
