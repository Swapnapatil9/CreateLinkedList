public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList2=new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();

        System.out.println();
        System.out.println("After pop Last...");

        Integer popLastElement = linkedList2.popLast();
        if(popLastElement == null)
            System.out.println("Linked List Empty");
        else
            System.out.println("Pop Last Element " + popLastElement);

        linkedList2.display();

    }
}
