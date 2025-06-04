import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;
        newNode.prev = curr;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) curr = curr.next;
        if (curr == null) return;
        newNode.next = curr.next;
        if (curr.next != null) curr.next.prev = newNode;
        curr.next = newNode;
        newNode.prev = curr;
    }

    void deleteFromBeginning() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
    }

    void deleteFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.prev.next = null;
    }

    void deleteAtPosition(int pos) {
        if (pos == 1) {
            deleteFromBeginning();
            return;
        }
        Node curr = head;
        for (int i = 1; i < pos && curr != null; i++) curr = curr.next;
        if (curr == null) return;
        if (curr.prev != null) curr.prev.next = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev;
    }

    void displayForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void displayReverse() {
        if (head == null) return;
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        while (true) {
            System.out.println("\n1.Insert at Beginning\n2.Insert at End\n3.Insert at Position");
            System.out.println("4.Delete from Beginning\n5.Delete from End\n6.Delete at Position");
            System.out.println("7.Display Forward\n8.Display Reverse\n9.Exit");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    dll.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    dll.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value and position: ");
                    dll.insertAtPosition(sc.nextInt(), sc.nextInt());
                    break;
                case 4:
                    dll.deleteFromBeginning();
                    break;
                case 5:
                    dll.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    dll.deleteAtPosition(sc.nextInt());
                    break;
                case 7:
                    System.out.println("List Forward:");
                    dll.displayForward();
                    break;
                case 8:
                    System.out.println("List Reverse:");
                    dll.displayReverse();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
