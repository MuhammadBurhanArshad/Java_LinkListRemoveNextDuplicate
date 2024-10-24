public class LinkList {
    public Node head;

    public LinkList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
    
        if(this.head == null){
            this.head = newNode;
        }else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayLinkList() {
        Node current = this.head;

        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null \n");
    }

    public void removeDuplicates(){
        if(this.head == null || this.head.next == null){
            return;
        }

        Node current = this.head;
        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

}
