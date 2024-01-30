package linklist;

public class Main {
    public static void main(String[] args) {
//        LinkList add = new LinkList();
//        add.add(10);
//        add.add(20);
//        add.add(30);
//        add.add(50);
//        add.add(60);
//        add.display();

        LinkListCount adds = new LinkListCount();
        adds.add(50);
        adds.add(50);
        adds.add(10);
        adds.add(10);

        adds.display();
        adds.displayALL();
        adds.uniqueElement();
        adds.display();
        adds.displayALL();
        System.out.println(adds.checkValue(10));
        System.out.println(adds.palindrome());

    }
}
