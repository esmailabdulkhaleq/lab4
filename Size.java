package lab4;

public class Size<E> {
        E head;
    Node<E> next;

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }



    public int size() {
        Node<E> temp = (Node<E>) head;
        int size = 0;
        if (head == null) {
            return size;
        } else {
            size++;
            while (temp.next!=null)
            {
                temp = (Node<E>) temp.next;
                size++;
            }
        }
        return size;
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
}

}
