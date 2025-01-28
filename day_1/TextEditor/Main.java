package TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(10);
        textEditor.addTextState("Hello");
        textEditor.addTextState("Hello, World!");
        textEditor.addTextState("Hello, World! How are you?");
        textEditor.displayCurrentText();

        textEditor.undo();
        textEditor.displayCurrentText();

        textEditor.redo();
        textEditor.displayCurrentText();

        textEditor.undo();
        textEditor.undo();
        textEditor.displayCurrentText();
    }
}
