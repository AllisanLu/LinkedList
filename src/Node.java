public class Node<E> {
    E value;
    Node<E> next;
    Node<E> previous;

    public Node(E input, Node p, Node n){
        this.value = input;
        this.next = n;
        this.previous = p;
    }

    public Node getNext(){ return next; }

    public void setNext(Node n) { next = n; }

    public Node getPrevious(){ return previous; }

    public void setPrevious(Node n) {previous = n;}

    public E getValue() { return value; }

    public void setValue(E input) { value = input; }
}
