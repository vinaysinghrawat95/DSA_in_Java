 import java.util.Scanner;

class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insert(int data) {
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

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean search(int value) {
        Node current = head;

        while (current != null) {
            if (current.data == value)
                return true;
            current = current.next;
        }

        return false;
    }

    public int size() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Insert\n2. Display\n3. Delete\n4. Search\n5. Size\n0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insert(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int del = sc.nextInt();
                    list.delete(del);
                    break;
                case 4:
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    System.out.println("Found: " + list.search(searchVal));
                    break;
                case 5:
                    System.out.println("Size: " + list.size());
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
