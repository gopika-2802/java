package linkedlist;

public class LL_lastele {
    Node head;
    class Node 
    {
        int data;
        Node next;
        // constructor
        public Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }
    //finding length
    public int length(Node head)
    {
        int count=0;
        Node curr=head;
        if(curr==null)
            return 0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
    // print linked list
    public void print(Node head)
    {
        Node CurrNode = head;

        while (CurrNode != null) 
        {
            System.out.print(CurrNode.data + " -> ");
            CurrNode = CurrNode.next;
        }
        System.out.println("null");
    }
    // add first
    public void addf(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last
    public void addl(int data) 
    {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        Node CurrNode = head;
        while (CurrNode.next != null) 
        {
            CurrNode = CurrNode.next;
        }
        CurrNode.next = newNode;
    }
    public void addAtPosition(int data, int pos) 
    {
        Node newNode = new Node(data);
        // position 1 na add first
        if (pos == 1) 
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        int i = 1;
        while (i < pos - 1 && currNode != null) 
        {
            currNode = currNode.next;
            i++;
        } 
        if (currNode == null)
        {
            System.out.println("Position not found");
            return;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }
    //lastele
    public int findlast(Node head)
    {
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        return curr.data;
    }
    //nthnode
    public int nthnode(Node head,int n)
    {
        Node temp=head;
        int count=1;
        while(temp!=null)
        {
            if(count==n)
                return temp.data;
        
        count++;
        temp=temp.next;
    }
    return 1;
    }
    public static void main(String[] args) 
    {
        LL list = new LL();
        list.addf(1);
        list.addf(2);
        list.addl(3);
        //list.addAtPosition(4, 3);
        //list.print(list.head);
        int length=list.length(list.head);
        System.out.println(length);
        //System.out.println(list.findlast(Node head));
    } 
}
