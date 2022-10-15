/*Singly linked list can be defined as the collection of ordered set of elements. The number of elements may vary according to need
 of the program. A node in the singly linked list consist of two parts: data part and link part. Data part of the node stores actual
  information that is to be represented by the node while the link part of the node stores the address of its immediate successor.
One way chain or singly linked list can be traversed only in one direction. In other words, we can say that each node contains only 
next pointer, therefore we can not traverse the list in the reverse direction.*/
package LinkedList;
public class Singly {
    Node head;
    int size;
    public Singly(){
this.size=0;
    }
    private class Node{
        int val;
        Node next;
      public Node(int val){
        this.val=val;
      }
      public Node(int val,Node next){
        this.val=val;
        this.next=next;
      }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.val+"->");
             temp=temp.next;
        }
        System.out.print("End");

    }
    public void insertAtFirst(int val){
          Node node=new Node(val);
         node.next=head;
         head=node;
         size++;
    }
    public Node findValue(Node node){
       while(node.next!=null){
            node=node.next;
       }
       return node;
    }
    public Node findNode(int index){
      Node node=head;
    for(int i=1;i<index;i++){
      node=node.next;
             
      }
    
      return node;
    }

    public void insertAtEnd(int val){
      if(head==null){
        insertAtFirst(val);
        return;
      }
    Node node1=findValue(head);
    Node node=new Node(val);
    node.next=null;
    node1.next=node;
    size++;
    }
    public void insertAtIndex(int index,int val){
    if(index==0){
      insertAtFirst(val);
    }
    if(index==size-1){
    insertAtEnd(val);
    }
    
   Node node1=findNode(index);
    Node node=new Node(val,node1.next);
    node1.next=node;
size++;
    }
    public int deleteAtBeg(){
    int val=head.val;

    head=head.next;
    size--;

    return val;
      
    }
    private int deleteAtEnd() {
      if(size<=1){
        return deleteAtBeg();
      }
      Node temp=findNode(size-1);
      int val=temp.next.val;
      temp.next=null;
      return val;
    }
    private int deleteAtIndex(int index) {
      if(index==0){
        return deleteAtBeg();
      }
      if(index==size-1){
        return deleteAtEnd();
      }
      Node temp=findNode(index);
      int val=temp.next.val;
      temp.next=temp.next.next;
      return val;
    }
    public static void main(String [] args) {
        Singly ll=new Singly();
        ll.insertAtFirst(5);
        ll.insertAtFirst(10);
        ll.insertAtFirst(15);
        ll.insertAtFirst(20);

        ll.insertAtEnd(25);

        ll.insertAtIndex(2, 30);

       System.out.println("Deleted: " +ll.deleteAtBeg());

       System.out.println("Deleted: " +ll.deleteAtEnd());

       System.out.println("Deleted: " +ll.deleteAtIndex(1));

       System.out.println(ll.size);
        ll.display();
        
    }
   
   
}
