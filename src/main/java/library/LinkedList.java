package library;

public class LinkedList {
    private class Node {
        public Object content;
        public Node previous, next;
        public Node(Object content) {
            this.content = content;
            this.previous = null;
            this.next = null;
        }
    }
    private Node startNode;
    public LinkedList() {
        this.startNode = null;
    }
    public void add(Object obj) {
        if (startNode == null) {
            startNode = new Node(obj);
        } else {
            Node tailNode = startNode;
            while (tailNode.next != null) {
                tailNode = tailNode.next;
            }
            tailNode.next = new Node(obj);
            tailNode.next.previous = tailNode;
        }
    }
    public Object remove(Object obj) {
        if (startNode == null) {
            return null;
        }
        Node pointer = startNode;
        while ((!pointer.content.equals(obj)) && (pointer.next != null)) {
            pointer = pointer.next;
        }
        if (pointer.content.equals(obj)) {
            if (pointer == startNode) {
                startNode = startNode.next;
            }
            if (pointer.previous != null) {
                pointer.previous.next = pointer.next;
            }
            if (pointer.next != null) {
                pointer.next.previous = pointer.previous;
            }
            return pointer.content;
        }
        return null;
    }
    public Object get(int i) {
        if ((i < 0) || (i >= length())) {
            return null;
        }
        Node pointer = startNode;
        for (int j = 0; j < i; ++j) {
            pointer = pointer.next;
        }
        return pointer.content;
    }
    public int length() {
        if (startNode == null) {
            return 0;
        }
        Node pointer = startNode;
        int i = 1;
        while (pointer.next != null) {
            pointer = pointer.next;
            ++i;
        }
        return i;
    }
    public String toString() {
        if (startNode == null) {
            return "[]";
        }
        Node pointer = startNode;
        String str = pointer.content.toString();
        while (pointer.next != null) {
            pointer = pointer.next;
            str += ", " + pointer.content.toString();
        }
        return "[" + str + "]";
    }
}