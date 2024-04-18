public class CLL {
        Node head;
        Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        newnode.next=head;
        tail=newnode;
    }

    public void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }while(temp!=head);
        System.out.println("END");
    }

    public void delete(int val){
        Node temp=head;
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        do{
            Node n=temp.next;
            if(n.data==val){
                temp.next=n.next;
                break;
            }
            temp=temp.next;

        }while(temp!=head);
    }

    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display();
        list.delete(4);
        list.display();
        
    }
}
