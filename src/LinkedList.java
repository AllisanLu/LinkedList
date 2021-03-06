public class LinkedList<E>{
    int size;
    private Node<E> head;
    private Node<E> current;
    private Node<E> tail;

    public LinkedList(){
        this.head = new Node(null, null, null);
        this.current = head;
        this.tail = new Node(null, null, null);
    }


    public int size(){ return size; }

    public Node<E> getHead() { return head; }

    public void setHead(Node<E> head) { this.head = head; }

    public Node<E> getCurrent() { return current; }

    public void setCurrent(Node<E> current) { this.current = current; }

    public Node<E> getTail() { return tail; }

    public void setTail(Node<E> tail) { this.tail = tail; }

    public void add(E i){
        size++;
        Node<E> add = new Node(i, tail, null);
        if(head.getValue() == null) {                //if there was nothing in the list at first
            head = add;
            head.setPrevious(null);
        }
        else if(head.getNext() == null){
            head.setNext(add);
            tail = add;
            tail.setPrevious(head);
        }
        else {
            tail.setNext(add);
            tail = add;
        }
    }
    public void remove(int i){
        size--;
        current = head;
        for(int x = 0; x < i - 1; x++){
            current = current.getNext();
        }
        //System.out.println(current.getValue());
        current.setNext(current.getNext().getNext());
        current.getNext().setPrevious(current);
    }

    public E getAt(int i){
        current = head;
        for(int x = 0; x < i; x++){
            current = current.getNext();
        }
        //System.out.println(i + ":" + current.getCurrent());
        return current.getValue();
    }
}
