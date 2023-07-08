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
    public void insert_at_beg(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            Node temp=head;
            head=newnode;
            newnode.next=temp;
        }
    }
    public void insert_at_middle(int data,int key){
        Node newnode=new Node(data);
        Node itr=head;
       // Node temp=null;
        while (itr.next!=null){

            if (itr.data==key){
                break;
            }
            itr=itr.next;
        }
        newnode.next=itr.next;
        itr.next=newnode;

    }

    //addNode() will add a new node to the list
    public void addNode_at_end(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }



        }
        void deletion_at_beg(){
        if (head==null){
            System.out.println("i am empty please do not delete");
        }
        else{
            head=head.next;
        }
        }
        public void deletion_at_end(){
        Node itr=head;
        if (head==null){
            System.out.println("ll is empty");
        }
        else{
            while (itr.next.next!=null){
                itr=itr.next;
            }
            itr.next=null;
        }
        }
        public void delete_by_node(int data){
        Node itr=head;
        while (itr.next!=null){
            System.out.println("atul");
            if (itr.next.data==data){


                break;

            }
            itr=itr.next;

        }
        itr.next=itr.next.next;
        //itr.next=null;

        }
        public void middle_element(){
        int count=0;
        int mid1=0;
        int mid2=0;
        Node itr=head;

        while(itr!=null){
            count+=1;
            itr=itr.next;

        }
        if (count%2==0){
            mid1=count/2+1;
            mid2=count/2;
            int x=0;
            itr =head;
            while (itr!=null){
                if ((x+1==mid1)|| x+1==mid2) {
                    System.out.println(itr.data + " ");
                }
                x+=1;
                itr=itr.next;

            }

        }
        else{
            mid1=count/2+1;
            itr=head;
            int x=0;
            while(itr!=null){

                if (x+1==mid1){
                    System.out.println(itr.data);
                }
                x=x+1;

                itr=itr.next;
            }
        }
        }
         void middle_ele(){
         Node fast=head;
         Node slow=head;
         while (fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
             System.out.println(slow.data+" is the middle ele");
        }
        void reverse(){
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        }

    public void display_1(){
        Node itr=head;
        while (itr!=null){
            System.out.print(itr.data+"-->");
            itr=itr.next;
        }
        System.out.println();
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Main sList = new Main();

        //Add nodes to the list
        sList.insert_at_beg(1);
        //sList.addNode(2);
        //sList.addNode(3);
        sList.insert_at_beg(4);
        sList.addNode_at_end(56);
        sList.insert_at_beg(44);
        sList.insert_at_beg(45);
        sList.insert_at_beg(49);
       // sList.deletion_at_beg();
        sList.insert_at_middle(567,4);
        //sList.deletion_at_end();
        sList.display_1();
        sList.delete_by_node(4);

        //Displays the nodes present in the list
        sList.display_1();
        sList.middle_ele();
        sList.reverse();
        sList.display_1();
    }
}