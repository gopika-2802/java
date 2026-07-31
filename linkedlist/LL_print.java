package linkedlist;

public class LL_print {
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
    
    public static void main(String[] args) 
    {
        LL list = new LL();
        list.print(list.head);
    }
    
}
