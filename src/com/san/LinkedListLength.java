package com.san;

public class LinkedListLength {
    public static void main(String[] args) {
        NodeList head = new NodeList(1);
        NodeList node1 = new NodeList(2);
        NodeList node2 = new NodeList(3);
        NodeList node3 = new NodeList(4);
        NodeList node4 = new NodeList(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        System.out.println("Is there a loop? " + LinkedListUtil.dedectLoop(head));

    }
}

class LinkedListUtil {
    public static void print(NodeList node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static NodeList findMiddle(NodeList head) {
        NodeList slowPtr = head;
        NodeList fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static int length(NodeList head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static boolean dedectLoop(NodeList head) {
        NodeList slow = head;
        NodeList fast = head;
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

    NodeList next;

    public NodeList(int data) {
        this.data = data;
    }

}
