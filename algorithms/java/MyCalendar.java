public class MyCalendar {
    public MyCalendar() {
        this.root = new CalenderBinaryTree();
    }

    class CalenderBinaryTree {
        int counter = 0;
        int start = -1, end = -1;
        CalenderBinaryTree left;
        CalenderBinaryTree right;
    }

    CalenderBinaryTree root;

    public boolean book(int start, int end) {
        CalenderBinaryTree current = this.root;
        Boolean bookable = false;
        while (true){
            if (current.start < 0) {
                current.start = start;
                current.end = end;
                bookable = true;
                break;
            }else if (current.end <= start){
                if (current.left == null) {
                    current.left = new CalenderBinaryTree();
                }
                current = current.left;
            }else if(end < current.start){
                if(current.right == null) {
                    current.right = new CalenderBinaryTree();
                }
                current = current.right;
            }else{
                break;
            }
        }

        return bookable;
    }
}

