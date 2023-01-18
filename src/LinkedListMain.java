public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();

        System.out.println();
        System.out.println("After pop...");

        Integer poppedElement = linkedList1.pop();
        if(poppedElement == null)
            System.out.println("Linked List Empty");
        else
            System.out.println("Popped Element " + poppedElement);

        linkedList1.display();
    }
}
