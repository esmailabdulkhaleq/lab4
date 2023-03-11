package lab4;
public class Rotate<E> {

    Node<E> head;
    public void rotate(){
        if (head==null || head.next==null){
            return;
        }
        Node last=head;
        while (last.next !=null){
            last= (Node) last.next;
        }
        last.next=head;
        head= (Node) head.next;
       ((Node<?>) last.next).next=null;
    }
    private static class Node<E>{
        E element;
       Node<E> next;
        public Node() {
        }
        public E getElement() {
            return element;
        }
        public void setElement(E element) {
            this.element = element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    }

