package linklist;

public class LinkList {
    
    private Node head;
    private int count;

    public void add(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        count++;
    }
    public void display(){
        System.out.println(count);
        System.out.println(head.value);
        System.out.println(head.next.value);
    }

    
    
    public class Node{
        private Node next;
        private int value;
        public Node(int value){
            this.value = value;
        }
    }
}
