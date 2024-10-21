import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Main.longestCommonPrefixWith2IntegerArrays();
//        Main.extraCharInString();
//        Main.designCircularDeque();
//        largestPNNumber();
        Main.arrPairsDivisible();

    }

    static void arrPairsDivisible(){
        ArrayParirsDivisible arrayParirsDivisible = new ArrayParirsDivisible();
        arrayParirsDivisible.canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5);
    }
    static void largestPNNumber(){
        LargestPNNumber largestPNNumber = new LargestPNNumber();
        largestPNNumber.findMaxK(new int[]{-1,2,-3,3});
    }
    static void designCircularDeque(){

        DesignCircularDeque.MyCircularDeque myCircularDeque = new DesignCircularDeque().new MyCircularDeque(3);
        myCircularDeque.insertLast(1);  // return True
        myCircularDeque.insertLast(2);  // return True
        myCircularDeque.insertFront(3); // return True
        myCircularDeque.insertFront(4); // return False, the queue is full.
        myCircularDeque.getRear();      // return 2
        myCircularDeque.isFull();       // return True
        myCircularDeque.deleteLast();   // return True
        myCircularDeque.insertFront(4); // return True
        myCircularDeque.getFront();     // return 4
    }

    static void extraCharInString(){
        ExtraCharInString extraCharInString = new ExtraCharInString();
        int min;
        min = extraCharInString.minExtraChar(
//                "zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccbb",
//                new String[]{"ffeed", "kkjji", "ppoon", "uutts", "zzyyx", "ccb", "dcc", "ddc", "eed", "fee", "ffe", "ggf", "hgg", "hhg", "iih", "jii", "jji", "kkj", "lkk", "llk", "mml", "nmm", "nnm", "oon", "poo", "ppo", "qqp", "rqq", "rrq", "ssr", "tss", "tts", "uut", "vuu", "vvu", "wwv", "xww", "xxw", "yyx", "zyy", "zzy"}
                "sayhelloworld",
                new String[]{"hello","world","owo"}
        );
        System.out.println(min);
    }

    static void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String str = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(str);
    }
    static void longestCommonPrefixWith2IntegerArrays() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.longestCommonPrefix(new int[]{1,10,100}, new int[]{10000});
    }

    void diffWaysToAddParentheses() {
        DiffWaysToAddParentheses diff = new DiffWaysToAddParentheses();
        List<Integer> list = diff.diffWaysToCompute("1*23*34");

        list.forEach(e -> System.out.println(e));
    }
    void mergeTwoSortedLists(){
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode node = new ListNode(1);
        node.next = new ListNode(4);
        node.next.next = new ListNode(5);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        mergeTwoSortedLists.mergeTwoLists(node, node2);
        MergeKLists mergeKLists = new MergeKLists();

        ListNode[] list = new ListNode[3];
        list[0] = node;
        list[1] = node2;
        list[2] = new ListNode(2);
        list[2].next = new ListNode(6);
        ListNode mergeKNode = mergeKLists.mergeKLists(list);
    }
    static void myCalendar(){
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.book(10, 20); // return True
        myCalendar.book(15, 25); // return False, It can not be booked because time 15 is already booked by another event.
        myCalendar.book(20, 30); // return True, The event can be booked, as the first event takes every time less than 20, but not including 20.
    }
}