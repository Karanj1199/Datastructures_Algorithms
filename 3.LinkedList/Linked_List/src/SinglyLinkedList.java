public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    //Creation
    public void createSinglyLinkedList(int nodeValue) {
//        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
    }

    //Insertion
    public void insertInLinkedList(int nodeValue,int location) {
        Node node = new Node();
        node.value = nodeValue;

        //if LinkedList is not created
        if(head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if(location == 0) { // If inserting at first location i.e head
            node.next = head;
            head = node;
        } else if(location >= size) { // If inserting at last location i.e tail
            node.next = null;
            tail.next = node;
            tail = node;
        } else { // If inserting anywhere in between
            Node tempNode = head;
            for(int i=1;i<location-1;i++){
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    //Traversal
    public void traverseSinglyLinkedList() {
        if(head==null) {
            System.out.println("Linked List does not exist");
        } else {
            Node tempNode = head;
            for(int i=0;i<size;i++) {
                System.out.print(tempNode.value);
                if(i != size-1) {
                    System.out.println(" -> ");
                }
                tempNode=tempNode.next;
            }
            System.out.println("\n");
        }
    }

    //Search a node
    boolean searchNode(int nodeValue){
        if(head != null){
          Node tempNode = head;
          for(int i=0;i<size;i++){
              if(tempNode.value == nodeValue){
                  System.out.println("The node is present at location" + i);
                  return true;
              }
              tempNode = tempNode.next;
          }
        }
        System.out.println("Node not found");
        return false;
    }

    //Delete a node
     public void deletionOfNode(int location) {
        if(head == null) {
            System.out.println("Linked List does not exist");
            return;
        } else if(location == 0) {
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        } else if(location >= size){
            Node tempNode = head;
            for(int i=0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    //Delete entire Linked List
    public void deleteLL(){
        head = null;
        tail = null;
        System.out.println("The Linked List deleted successfully");
    }
}
