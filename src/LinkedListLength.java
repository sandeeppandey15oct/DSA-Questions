public class LinkedListLength {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println("Is there a loop? " + LinkedListUtil.dedectLoop(head));

    }
}

class LinkedListUtil {
    public static void print(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static Node findMiddle(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static int length(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static boolean dedectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("There is a loop");
                return true;
            }
        }
        return false;

    }
}

class NodeList {
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    int data;

    Node next;

    public NodeList(int data) {
        this.data = data;
    }

}
