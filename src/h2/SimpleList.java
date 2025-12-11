package h2;

public class SimpleList {
    public Node head;
    public SimpleList () {
      head = new Node(Integer.MIN_VALUE);
    }
    public Node getFirst() {
        if  (head.next == null) {
            return null;
        }
        return head.next;
    }
    public Node getLast() {
        if   (head.next == null) {
            return null;

        }
        Node current = head.next;
        while (current.next != null) {
            current = current.next;
        } return current;
    }
    public void append(int newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        while  (current.next != null) {
            current = current.next;
        } current.next = newNode;

    }
}
