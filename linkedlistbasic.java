public class linkedlistbasic {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;

    public void addFirst(int data){
        // step1 create new node
        node  newnode = new node(data);
        // base case
        if(head == null){
            head = tail = newnode;
            return;
        }
        // step 2 newnodenext = head
        newnode.next = head;
        // step3 newnode = head
        head = newnode; 
    }
    public void addlast(int data){
        node newnode = new node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"==>");
            temp = temp.next;
        }
        System.out.println("null");
    }
   public void add(int idx,int data){
    if(idx == 0){
        addFirst(data);
        return;
    }
    node newnode = new node(data);
    node temp = head;
    int i = 0;
    while(i< idx-1){
        temp = temp.next;
        i++;
    }
    // i = idx-1 -> temp = previous
    newnode.next = temp.next;
    temp.next = newnode;
   }
       
    public static void main(String args[]){
        linkedlistbasic ll = new linkedlistbasic();
       // ll.head = new node(1);
        // ll.head.next = new node(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
    }
}
