public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    public void push(E key){
        Node<E> newNode= new Node<>(key);
        if(head == null){
            head=newNode;
            tail=newNode;
        } else {
            tail.next= newNode;
            tail= newNode;
        }
    }
    public void display(){
        Node<E> temp=head;
        while(temp!=null){
            System.out.print(temp.key +" -> ");
            temp=temp.next;
        }
    }

}