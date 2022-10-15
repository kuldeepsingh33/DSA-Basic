package Java.LinkedList;

public class Doubly  {
    Node head;
    int size;
    public class Node{
        int val;
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
        }
    }
public void insertStart(int val){

Node node=new Node(val,head,null);
if(head!=null)
{
    head.prev=node;

}
head=node;
size++;
}

public void insertLast(int val){
    Node temp=head;
    if(temp==null){
        insertStart(val);
        return;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
    Node node=new Node(val,null,temp);
    temp.next=node;


    
}
public void display(){
    Node temp=head;
    while(temp!=null){
         System.out.print(temp.val+"->");
         temp=temp.next;
    }
    System.out.print("End");

}
private void insertAfter(int i,int val) {
Node temp=head;
while(temp.next!=null){
    if(temp.val==i)
    break;
  temp=temp.next;  
}
if(temp.val!=i){
    System.out.println("Node does not exist");
    return;
}
Node node=new Node(val,temp.next,temp);
temp.next=node;
if(node.next!=null){
    node.next.prev=node;
}

}

public static void main(String [] args) {
    Doubly ll=new Doubly();
    ll.insertStart(10);
    ll.insertStart(20);
    ll.insertLast(25);
    ll.insertAfter(25,30);

    ll.display();
}


}
