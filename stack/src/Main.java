public class Main {
    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
    public Node prv=null;
    void push(int data){
        Node newnode= new Node(data);
        if (head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            prv=tail;
            tail=tail.next;

        }
    }
    void print(){
        Node itr=head;
        while(itr!=null){
            System.out.print(itr.data+"-->");
            itr=itr.next;
        }
    }
    public static void main(String []args){
        Main stack=new Main();
        stack.push(34);
        stack.push(4565);
        stack.push(23);
        stack.print();
    }
}
