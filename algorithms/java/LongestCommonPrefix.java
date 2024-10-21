public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < strs[0].length()) {
            sb.append(strs[0].charAt(index));
            for (String str : strs) {

                if (str.length() <= index || sb.charAt(index) != str.charAt(index)) {
                    sb.deleteCharAt(index);
                    return sb.toString();
                }
            }
            index++;
        }
        return sb.toString();
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int result = 0;
        PrefixTree prefixTree = new PrefixTree();
        for (int i = 0; i < arr1.length; i++) {
            prefixTree.generateTree(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            int num = prefixTree.findLongestCommonPrefix(arr2[i]);
            result = Math.max(result, num);
        }
        return result;
    }

    class PrefixTree {
//        int counter = 0;
        PrefixTree[] children = new PrefixTree[10];

        void generateTree(Integer num) {
            String str = num.toString();
            PrefixTree node = this;
            for (int i = 0; i < str.length(); i++) {
                int ch_num = str.charAt(i) - '0';
                if(node.children[ch_num] == null) {
                   node.children[ch_num] = new PrefixTree();
                }
//                node.children[ch_num].counter++;
                node = node.children[ch_num];
            }

        }
        int findLongestCommonPrefix(Integer num) {
            int result = 0;
            String str = num.toString();
            PrefixTree node = this;
            for (int i = 0; i < str.length(); i++) {
                int ch_num = str.charAt(i) - '0';
                if(node.children[ch_num] != null) {
                    node = node.children[ch_num];
                    result++;
                }else{
                    break;
                }
            }
            return result;
        }

    }
}
