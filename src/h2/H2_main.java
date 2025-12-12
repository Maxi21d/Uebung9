package h2;

public class H2_main {

    public static void main(String[] args) {
        SimpleList list = new SimpleList();

        // 1. Liste füllen
        list.append(10);
        list.append(20);
        list.append(30);

        System.out.print("Liste nach append: ");
        printList(list);

        // 2. Einfügen (fügt 99 hinter der 10 ein)
        list.insertAfter(10, 99);

        System.out.print("Liste nach insert: ");
        printList(list);

        // 3. Löschen
        list.delete(20);

        System.out.print("Liste nach delete: ");
        printList(list);
    }

    //Hilfsmethode zum Anzeigen
    public static void printList(SimpleList list) {
        Node current = list.head.next; // Den false Head überspringen
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
