package comparableVsComparator;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printForward();   // 10 <-> 20 <-> 30 <-> null
        list.printBackward();  // 30 <-> 20 <-> 10 <-> null
        list.deleteNode(20);
        list.printForward();
    }

    DNode head;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void add(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        current.prev = current;
    }

    public void printForward() {
        if (head == null) {
            return;
        }
        DNode current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        if (head == null) {
            return;
        }
        DNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.prev;
        }
        System.out.println("null");
    }

    public void deleteNode(int key) {
        DNode current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current == null) return;  // not found
        if (current.prev != null) current.prev.next = current.next;
        else head = current.next;  // if head node is deleted
        if (current.next != null) current.next.prev = current.prev;
    }
}

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
