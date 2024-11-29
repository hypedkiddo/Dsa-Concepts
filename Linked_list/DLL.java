public class DLL {
    Node head;
    //inserting node at first
    public void insertfirst(int data){
        Node node=new Node(data);
        node.prev=null;
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            last=temp;
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("Reverse order");
        while(last!=null){
            System.out.print(last.data+"-->");
            last=last.prev;
        }
        System.out.println("END");
    }

    public void insertlast(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=null;
        Node temp=head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(5);
        list.insertlast(8);
        list.display();
    }
}
