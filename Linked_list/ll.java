//We are creating a implementation of linked list from scratch
class ll{
    Node head;
    int size;
    class Node{
        String data;
        Node next;
        //Making a constructor
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
       Node temp=head;
       while(temp.next!=null){
        temp=temp.next;
       }
       temp.next=newnode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
         System.out.print(temp.data+"\t");
         temp=temp.next;
        }
        System.out.println(temp.data);

    }

    public void deletefirst(){
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        head=head.next;
        size--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        Node secondlast=head;
        Node lastnode=head.next;
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }

    public  void getsize(){
       System.out.println(size);
    }

    public static void main(String[] args) {
        ll list=new ll();
        list.addfirst("Naren");
        list.addLast("is a");
        list.addLast("good");
        list.addLast("boy");
        list.printList();
        list.getsize();
    }
}