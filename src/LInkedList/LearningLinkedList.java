package LInkedList;

public class LearningLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node temp=a;
        a.next=b;
        b.next=c;
        c.next=d;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
