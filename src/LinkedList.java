public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;


    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
    }

    public void append(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public E popLast() {
        if (head == null)
            return null;
        E popElement = tail.key;
        Node<E> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popElement;

    }
}
