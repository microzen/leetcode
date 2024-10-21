public class ReformatTheString {
    public String reformat(String s) {
        char[] n = new char[s.length()];
        char[] l = new char[s.length()];
        int n_index = 0, l_index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                n[n_index] = s.charAt(i);
                n_index++;
            } else {
                l[l_index] = s.charAt(i);
                l_index++;
            }
        }
        if (Math.abs(n_index - l_index) > 1) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int min = Math.min(n_index,l_index);

        for (int i = 0; i < min; i++) {
            result.append(l[i]);
            result.append(n[i]);
        }
        if (n_index == l_index)
            return result.toString();
        if (l_index == min) {
            result.insert(0, n[min]);
        } else {
            result.append(l[min]);
        }
        return result.toString();
    }

}
