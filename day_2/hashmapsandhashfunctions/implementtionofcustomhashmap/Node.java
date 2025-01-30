package hashmapsandhashfunctions.implementtionofcustomhashmap;

public class Node {
    // The key and value for the node
    private String key;
    String value;
    // The next node in the linked list for handling collisions
    public Node next;

    // Constructor to initialize the key, value, and next node
    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    // Getter for the key
    public String getKey() {
        return key;
    }

    // Getter for the value
    public String getValue() {
        return value;
    }
}
