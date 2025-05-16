package comparableVsComparator;

public class SinglyLinkedList {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();  // 10 -> 20 -> 30 -> null
        list.delete(30);
        list.print();  // 10 -> 3
        System.out.println(list.head.next.data);
    }
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            //System.out.println("current node:" + current.next);
            current = current.next;
        }
        System.out.println("null");
    }

    public void delete(int key) {
        if (head == null) {
            return;
        }
        if (head.data == key) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.next = next;
        this.data = data;
    }
}

