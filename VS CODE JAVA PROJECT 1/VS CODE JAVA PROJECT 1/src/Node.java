public class Node {
    int data;
    Node next;
}

 class run
{ 
    public static void main(String[] args) {
        
    LinkedList list= new LinkedList();
    list.insert(10);
     list.insert(1);
      list.insert(19);
        list.insert(15);
        list.insertAtStart(5);
        list.inserAt(2, 12);
        list.inserAt(0,11);
        list.deleteAt(0);
        list.deleteAt(2);

    list.show();
}}

class LinkedList{
    Node head;

    public void insert(int data)
    {
        Node n= new Node();
        n.data=data;
        n.next=null;
        if(head==null)
        {
            head=n;
        }
        else{
            Node node=head;
            while(node.next!=null)
            {
                node= node.next;
            }
            node.next=n;
        }
    }
    public void insertAtStart(int data)
    {
        Node n= new Node();
        n.data=data;
        n.next=head;
        head=n;
    }
    public void inserAt(int index,int data)
    {
        Node n=new Node();
        n.data=data;
        
        Node node= head;
        if(index==0)
        {
           insertAtStart(data);
        }
        else{
        for(int i=0;i<index-1;++i)
        {
           node=node.next;
        }
        n.next=node.next;
        node.next=n;}
    }
    public void deleteAt(int index)
    {
        Node node= head;
        if(index==0)
        {
           head=node.next;
        }
        else{
        for(int i=0;i<index-1;++i)
        {
           node=node.next;
        }
        Node n=node.next;
        node.next=n.next;
    } 
    }
    {

    }
    public void show()
    {
        Node node= head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}
