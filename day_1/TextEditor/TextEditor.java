package TextEditor;

public class TextEditor {
    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;
    private int maxSize;
    private int size;

    public TextEditor(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Add a new text state at the end of the list
    public void addTextState(String textContent) {
        TextStateNode newNode = new TextStateNode(textContent);
        if (current != null) {
            // Remove all states ahead of current state
            current.next = null;
        }
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        current = newNode;
        size++;

        // Limit the history size to maxSize
        if (size > maxSize) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Implement undo functionality
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    // Implement redo functionality
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    // Display the current state of the text
    public void displayCurrentText() {
        if (current != null) {
            System.out.println("Current Text: " + current.textContent);
        } else {
            System.out.println("No text available.");
        }
    }
}
