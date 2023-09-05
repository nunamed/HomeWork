public class LinkList {
    public Node head;
    public LinkList(){
        head=new Node();
    }
    public LinkList(int n,boolean Order){
        this();
        if(Order){
            create1(n);
        }
        else{
            create2(n);
        }
    }
    private void create1(int n) {
        Node p=head;
        for(int x=1;x<=n;x++){
            p.next=new Node();
            p=p.next;
        }
    }
    private void create2(int n) {
        for(int x=1;x<=n;x++){
            head.next=new Node(null,head.next);
        }
    }
    public void insert(int i,Object data){
        Node p=head;
        for (int j = 1; j <= i; j++) {
            p=p.next;
        }
        p.data=data;
        
    }
    public void remove(int i){
        Node p=head;
        for (int j = 1; j < i; j++) {
            p=p.next;
        }
        p.next=p.next.next;
    }
    public void display(){
        Node p =head.next;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
        System.out.println();
    }
    public static void difference(LinkList a,LinkList b) throws Exception{
        Node p =a.head.next;
        Node tmp=a.head;
        boolean index=false;
        while(p!=null){
            Node q=b.head.next;
            while(q!=null){
                if(p.data.equals(q.data)){
                    tmp.next=p.next;
                    index=true;
                }
                q=q.next;
            }
            if(index)
                index=false;
            else
                tmp=p;
            p=p.next;
        }
    }
    public static void main(String[] args) throws Exception {
        LinkList a = new LinkList(4,true);
        a.insert(1, 3);
        a.insert(2, 1);
        a.insert(3, 2);
        a.insert(4, 5);
        LinkList b = new LinkList(3,true);
        b.insert(1, 3);
        b.insert(2, 1);
        b.insert(3, 2);
        b.insert(2, 5);
        LinkList.difference(a, b);
        a.display();
    }
}
