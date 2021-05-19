package doublelinked;
public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int lenght;
    
    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;
        
        public ListNode(int data){
            this.data = data;
        }
    }
    
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.lenght = 0;
    }
    public boolean isEmpty(){
        return lenght == 0;
    }
    public int lenght() {
        return lenght;
    }
    public void displayForward(){
        if(head == null) {
            return;
        }
        ListNode temp = head;
        while(temp !=null){
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while(temp !=null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail  = newNode;
        } else {
            head.previous = newNode;   
        }
        newNode.next = head;
        head = newNode;
        lenght++;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(1);
        //dll.insertFirst(15);
        
        dll.displayForward();
        dll.displayBackward();
        
    
    }
    
    
    
}
