class LL{
    private int size;
    class node{             // Creating the Node class
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public int getSize(){           // Getting the size of Linked List
        return size;
    }
    node head,temp;
    LL(){
        this.size=0;
    }
    public void AddNode(String data){        // Adding the Nodes in the Linked List
        node NewNode=new node(data);
        NewNode.next=null;
        if(head==null){
            head=temp=NewNode;
            return;
        }
        else{
            temp.next=NewNode;
            temp=NewNode;
        }
    }
    public void AddLast(String data){        // Add Node at the last of the Linked List
        node NewNode=new node(data);
        if(head==null){
            head=temp=NewNode;
            return;
        }
        else {
            node Current=head;
            while (Current.next!=null){
                Current=Current.next;
            }
            Current.next=NewNode;
        }
    }
    public void PrintList(){                 // Printing the List
        if (head==null){
            System.out.println("List is Empty!!!");
            return;
        }
        else {
            node Current=head;
            while (Current!=null){
                System.out.print(Current.data+" -> ");
                Current=Current.next;
            }
            System.out.println("NULL");
        }
    }
    public void DelFirst(){
        if (head==null){
            System.out.println("List is Empty!!!");
            return;
        }
        else {
            size--;
            head=head.next;
            System.out.println("First Node is Deleted...");
            PrintList();
        }
    }
    public void DelLast(){
        if (head==null){
            System.out.println("List is Empty!!!");
            return;
        }
        else if (head.next==null){
            size--;
            head=null;
            return;
        }
        else {
            size--;
            node Current=head;
            node prev=null;
            while (Current.next!=null){
                prev=Current;
                Current=Current.next;
            }
            prev.next=null;
            System.out.println("Last Node is Deleted...");
            PrintList();
        }
    }
}
public class LinkedList {
    public static void main(String[] args) {
        LL list1=new LL();
        list1.AddNode("This");
        list1.AddNode("is");
        list1.AddNode("a");
        list1.AddLast("Node");
        list1.PrintList();
        list1.DelLast();
        list1.DelFirst();
        System.out.println(list1.getSize());
    }
}
