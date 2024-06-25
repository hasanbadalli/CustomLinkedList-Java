public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList(){
        this.tail = null;
        this.head = null;
        this.size = 0;
    }



    public static class Node<E>{
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E data, Node<E> prev, Node<E> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

    }

    public void add(E data){
        addLast(data);
    }

    public void addLast(E data){
        Node<E> last = tail;
        Node<E> newNode = new Node(data, last, null);
        if(last == null){
            this.head = newNode;
        }else{
            last.next = newNode;
        }

        this.tail = newNode;

        size++;
    }

    public void addFirst(E data){
        Node<E> last = head;
        Node<E> newNode = new Node(data, null, last);
        if(last == null){
            this.tail = newNode;
        }else{
            last.prev = newNode;
        }

        this.head = newNode;

        size++;
    }

    public E get(int index){
        indexCheck(index);
        if(index < size/2){
            Node<E> node = this.head;
            for(int i = 0; i < index; i++){
                node = node.next;
            }
            return node.data;
        }else{
            Node<E> node = this.tail;
            for(int i = size-1; i > index; i--){
                node = node.prev;
            }
            return node.data;
        }
    }

    public void remove(int index){
        indexCheck(index);
        Node<E> node = head;
        for(int i = 0; i < index;i++){
            node = node.next;
        }
        if(node.prev != null){
            node.prev.next = node.next;
        }else{
            head = node.next;
        }
        if(node.next != null){
            node.next.prev = node.prev;
        }else{
            tail = node.prev;
        }
    }

    public void print(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void clear(){
        Node node = head;
        while(node != null){
            Node nextNode = node.next;
            node.prev = null;
            node.next = null;
            node = nextNode;
        }
        head = null;
        tail = null;
    }

    private void indexCheck(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
    }
}
