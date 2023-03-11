package lab4;
public class Find<E> {



    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public Find() {
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }
    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }
    public void addFirst(E i) {
        head = new Node<>(i, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E i) {
        Node<E> newest = new Node<>(i, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
            tail = newest;
            size++;
        }
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }
    public void getPenultimate() {
        if (isEmpty()) {
            System.out.println("List is empty. Please check.");
        } else {
            System.out.println("The second last node is: " + head.penultimate(head));
        }
}


    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> penultimate;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
            penultimate = null;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public Node<E> penultimate(Node<E> head) {
            Node<E> current = head;
            while (current != null) {
                if (head.getNext() == null) {
                    penultimate = head;
                } else {
                    current = current.getNext();
                }
            }
            return penultimate;
        }
    }


}