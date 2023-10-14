package LInkedList;

public class ImplementationLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtBegining(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;

        }
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if (head == null) {
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(5);
        //ll.display();
        ll.insertAtBegining(2);
        ll.display();
        System.out.println(" ");
        System.out.println(ll.size);
    }
}
