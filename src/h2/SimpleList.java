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
    public Node findFirst(int value) {
        Node current = head.next;
        while (current != null) {
            if (value == current.value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public boolean insertAfter(int preValue, int newValue) {
        Node target = findFirst(preValue);
        if (target == null) {
            return false;
        }
        Node newNode = new Node(newValue);
        newNode.next = target.next;
        target.next = newNode;
        return true;
    }
    public boolean delete(int value) {
        Node current = head;
        while (current.next != null) {
            if (value == current.next.value) {
                current.next = current.next.next;
                return true;
            }
            else  {
                current = current.next;
            }

        }
        return false;
    }
}
