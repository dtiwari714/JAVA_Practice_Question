package LInkedList;

public class RecusrsiveLinkedList {
    public static void display(Node head,int count){
        if(head==null){
            System.out.println(" ");
            System.out.println("The length of linked list is:"+count);
            return;
        }
        //display(head.next);
        System.out.print(head.data+" ");
        display(head.next,count+1);

    }
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
        Node e=new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a,0);

    }
}
