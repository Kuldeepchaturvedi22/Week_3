package hashmapsandhashfunctions.implementtionofcustomhashmap;

public class CustomHashMap {
    // Array to hold the linked lists for each hash bucket
    private Node[] hashTable;
    // Size of the hash table
    private int size;

    // Constructor to initialize the hash table with a given size
    public CustomHashMap(int size) {
        this.size = size;
        hashTable = new Node[size];
    }

    // Hash function to map a key to an index
    private int hash(String key) {
        return key.hashCode() % size;
    }

    // Method to insert a key-value pair into the hash map
    public void put(String key, String value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        // If there is no node at the index, place the new node there
        if (hashTable[index] == null) {
            hashTable[index] = newNode;
        } else {
            // Collision occurred, handle by chaining
            Node current = hashTable[index];
            while (current != null) {
                if (current.getKey().equals(key)) {
                    current.value = value; // Update the value if key already exists
                    return;
                }
                if (current.next == null) {
                    break;
                }
                current = current.next;
            }
            current.next = newNode; // Add the new node at the end of the list
        }
    }

    // Method to retrieve a value by its key
    public String get(String key) {
        int index = hash(key);
        Node current = hashTable[index];

        // Traverse the linked list at the index
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue(); // Return the value if key is found
            }
            current = current.next;
        }

        return null; // Return null if the key is not found
    }

    // Method to delete a key-value pair from the hash map
    public void remove(String key) {
        int index = hash(key);
        Node current = hashTable[index];
        Node previous = null;

        // Traverse the linked list at the index
        while (current != null) {
            if (current.getKey().equals(key)) {
                if (previous == null) {
                    hashTable[index] = current.next; // Remove the first node
                } else {
                    previous.next = current.next; // Remove the node in the middle or end
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}
