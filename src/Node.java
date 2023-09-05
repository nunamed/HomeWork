public class Node {
    public Node next;
    public Object data;

    public Node(){
        this(null,null);
    }
    public Node(Object data){
        this(data,null);
    }
    public Node(Object data, Node next) {
        this.data = data;
        this.next =next;
    }
}
