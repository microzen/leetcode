import java.util.*;

public class ExtraCharInString {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        var dictionarySet = new HashSet<>(Arrays.asList(dictionary));
        var dp = new int[n + 1];

        for (int start = n - 1; start >= 0; start--) {
            dp[start] = dp[start + 1] + 1;
            for (int end = start; end < n; end++) {
                var curr = s.substring(start, end + 1);
                if (dictionarySet.contains(curr)) {
                    dp[start] = Math.min(dp[start], dp[end + 1]);
                }
            }
        }

        return dp[0];
    }

    int dp(String s, String[] dictionary) {
        int min = s.length();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> arrint = new ArrayList<>();
        for (String str : dictionary) {
            KMPString kmpString = getKMPString(str);
            int index = kmpString.find(s, 0);
            if (index >= 0) {
                arr.add(str);
                arrint.add(index);
            }
        }
        String[] array = arr.toArray(new String[arr.size()]);
        for (int i = 0; i < array.length; i++) {
            StringBuffer sb = new StringBuffer(s);
            int index = arrint.get(i);
            String str = array[i];
            sb.replace(index, index + str.length(), "");
            min = Math.min(dp(sb.toString(), array), min);
        }
        return min;
    }

    Map<String, KMPString> map = new HashMap<>();

    KMPString getKMPString(String value) {
        if (map.containsKey(value)) {
            return map.get(value);
        } else {
            KMPString kmpString = new KMPString(value);
            map.put(value, kmpString);
            return kmpString;
        }
    }

    class KMPString {
        int[] wordIndex;
        String word;
        int cursor = 0;

        KMPString(String word) {
            int length = word.length();
            this.word = word;
            wordIndex = new int[length + 1];
            wordIndex[0] = 0;
            wordIndex[1] = 0;

            int cu = 0;
            for (int i = 2; i < length + 1; i++) {
                if (word.charAt(i - 1) == word.charAt(cu)) {
                    cu++;
                } else {
                    cu = 0;
                }
                wordIndex[i] = cu;
            }
        }

        private boolean match(char ch) {
            if (ch == word.charAt(cursor)) {
                cursor++;
            } else {
                cursor = wordIndex[cursor];
            }
            if (cursor == word.length()) {
                return true;
            } else {
                return false;
            }
        }

        int find(String s, int start) {
            for (int i = start; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (match(ch)) {
                    cursor = 0;
                    return i - this.word.length() + 1;
                }
            }
            cursor = 0;
            return -1;
        }
    }
}
