package linkedlist;

public class LL_length {
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
    public static void main(String[] args) 
    {
        LL list = new LL();
        int length=list.length(list.head);
        System.out.println(length);
    }
    
}
