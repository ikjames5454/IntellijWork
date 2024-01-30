package linklist;

import java.util.LinkedList;
import java.util.List;

public class LinkListCount {
    private Node head;
    private int count;

    public void add(int value) {
        Node node = new Node(value);
        node.setNext(head);
        head = node;
        count++;
    }

    public void display() {
        System.out.println(count);
        System.out.println(head.getValue());
    }

    public void uniqueElement() {
        Node current = head;
        while (current != null) {
            Node next = current;
            while (next.getNext() != null) {
                if (current.getValue() == next.getNext().getValue()) {
                    next.setNext(next.getNext().getNext());
                } else {
                    next = next.getNext();
                }
            }
            current = current.getNext();
        }
    }

    public void displayALL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();

        }
        System.out.println();
    }

    public boolean checkValue(int value) {
        Node current = head;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean palindrome() {
        Node current = head;
        Node next = head;
        List<Integer> palindrome = new LinkedList<>();
        while (next != null && next.getNext() != null) {
            palindrome.add(current.getValue());
            current = current.getNext();
            next = next.getNext().getNext();
        }
        while (next != null){
            current = current.getNext();
            next = next.getNext();
        }

        while(current != null){
            for(int a =0; a < palindrome.size(); a++){
                if (current.getValue() == palindrome.get(a)-1){
                    return true;
                }
                current = current.getNext();
            }
        }
        return false;
    }
}