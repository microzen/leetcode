public class CustomStack {
    int[] table;
    int head;
    public CustomStack(int maxSize) {
        table = new int[maxSize];
        head = -1;
    }
    public void push(int x) {
        if(head + 1 < table.length) {
            table[++head] = x;
        }
    }
    public int pop() {
        if(head == -1) {
            return -1;
        }else{
            return table[head--];
        }
    }
    public void increment(int k, int val) {
       for(int i = 0; i < k && head >= i; i++) {
           table[i] = table[i] + val;
       }
    }
}
