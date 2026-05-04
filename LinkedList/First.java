package LinkedList;

public class First {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
               this.data=data;
               this.next=null;
        }
    }
    Node head;
    public void addFirst(int data){
       Node newNode = new Node(data);
        if(head==null){
          head=newNode;
          return;
        }
        newNode.next=head;
        head=newNode;
        return;
        
    }
    public void addLast(int data){
         Node newNode = new Node(data);
        if(head==null){
          head=newNode;
          return;
        }
        Node temp = head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
        return;
    }
    public  void print(){
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return;
    }
    public void removeFirst(){
            if ( head==null){
                System.out.print("Empty");
                return;
            } 
            head=head.next;
    }
    public void removeLast(){
            if ( head==null){
                System.out.print("Empty");
                return;
            } 
            Node  temp = head;
            while(temp.next.next !=null){
                temp = temp.next;
            }
            temp.next=null;
            // head=head.next;
    }
    public void addWithIndex(int index,int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        Node temp = head;
        while(index != 1){
             temp =temp.next;
             index--;
        }
        newNode.next=temp.next;
        temp.next=newNode;
       // System.out.println(temp.data);
        return ;
    }
    public static void main(String args[]){
          First ll=new First();
          ll.addFirst(10);
          ll.addLast(20);
          ll.addLast(30);
          ll.addLast(40);
          ll.print();
          System.out.println("");
          ll.addWithIndex(2, 15);
         // ll.removeFirst();
          //ll.removeLast();
        //   ll.removeFirst();
        //   ll.removeFirst();
        //   ll.removeFirst();
        //   ll.removeFirst();
          ll.print();
        }
}
