package InventoryManagementSystem;

public class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
