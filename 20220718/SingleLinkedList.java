public class SingleLinkedList {

    public static void main(String[] args) {

    }

}

class LinkedList {
    private Node nodeHead;

    public LinkedList() {
        this.nodeHead = null;
    }

}

class Node {
    private String data;
    private Node listNode;

    public Node() {
        this.data = null;
        this.listNode = null;
    }

    public Node(String data) {
        this.data = data;
        this.listNode = null;
    }

    public Node(String data, Node listNode) {
        this.data = data;
        this.listNode = listNode;
    }

    public String getData() {
        return this.data;
    }

    public Node getListNode() {
        return this.listNode;
    }
}
