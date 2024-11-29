class ll{
     Node head;
    private int size;
    ll(){
        this.size=0;
    }
    //Lets do Implemantion of Linked list from scratch
    private class Node{
        int data;
        Node next;
        Node(){
            this.data=-1;
        }
        Node(int data){
            this.data=data;
        }
    }

    public void addfirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void delete(int data){
        if(head.data==data){
            head=head.next;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==data){
                prev.next=temp.next;
                temp=null;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

}
