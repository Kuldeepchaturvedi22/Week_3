package TextEditor;

public class TextStateNode {
    String textContent;
    TextStateNode prev;
    TextStateNode next;

    public TextStateNode(String textContent) {
        this.textContent = textContent;
        this.prev = null;
        this.next = null;
    }
}
