public class DesignCircularDeque {

    class MyCircularDeque {
        class Node{
            int value;
            Node previous;
            Node next;
        }
        Node head;
        Node tail;
        int nodeSize = 0;
        int size;


        public MyCircularDeque(int k) {
            this.size = k;
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.previous = head;
        }

        public boolean insertFront(int value) {
            if(isFull()){
                return false;
            }else{
                this.nodeSize = nodeSize + 1;
                Node newNode = newNode(value);
                if(isEmpty()){
                    newNode.previous = head;
                    newNode.next = tail;
                    tail.previous = newNode;
                    head.next = newNode;
                    return true;
                }else {
                    Node next = head.next;

                    newNode.previous = head;
                    newNode.next = next;

                    next.previous = newNode;
                    head.next = newNode;
                    return true;
                }

            }
        }

        public boolean insertLast(int value) {
            if(isFull()){
                return false;
            }else{
                this.nodeSize = nodeSize + 1;
                Node newNode = newNode(value);
                if(isEmpty()){
                    newNode.previous = head;
                    newNode.next = tail;
                    head.next = newNode;
                    tail.previous = newNode;
                    return true;
                }else {
                    Node previous = tail.previous;

                    newNode.previous = previous;
                    newNode.next = tail;

                    previous.next = newNode;
                    tail.previous = newNode;
                    return true;
                }
            }
        }
        private Node newNode(int value){
            Node newNode = new Node();
            newNode.value = value;
            return newNode;
        }

        public boolean deleteFront() {
            if(isEmpty()){
                return false;
            }else {
                Node next = head.next.next;

                next.previous = head;
                head.next = next;
                this.nodeSize--;
                return true;
            }
        }

        public boolean deleteLast() {
            if(isEmpty()){
                return false;
            }else {
                Node previous = tail.previous.previous;

                previous.next = tail;
                tail.previous = previous;
                this.nodeSize--;
                return true;
            }
        }

        public int getFront() {
            if(isEmpty()){ return -1;}
            return head.next.value;
        }

        public int getRear() {
            if(isEmpty()){ return -1;}
            return tail.previous.value;
        }

        public boolean isEmpty() {
            if(head.next == tail) {
                return true;
            }else{
                return false;
            }
        }

        public boolean isFull() {
            if(nodeSize == size) {
                return true;
            }else {
                return false;
            }
        }
    }

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
}
