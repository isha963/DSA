
class node{
  int data;
  node next;

  node(int data){
    this.data = data;
    this.next = null;
  }
}

public class reversell {
  

  public static node reverse(node start){
    node prev= null;
    node curr = start;
     node next =null;

     while(curr!=null){
      next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
     }

     start = prev;
     return start;
  }

public static void print(node start){
 node temp = start;

 while(temp!=null){
  System.out.print(temp.data + "->");
  temp=temp.next;
 }
  System.out.println("null");
}
 public static void main(String[] args) {
    node start = new node(1);
    start.next= new node(2);
    start.next.next = new node(3);
    start.next.next.next = new node(4);
    start.next.next.next.next= new node(5);

    System.out.println("Original List: ");
    print(start);
    node n=reverse(start);
     System.out.println("Reversed List: ");
     print(n);
     
  }
}
