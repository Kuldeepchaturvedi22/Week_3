package InventoryManagementSystem;

public class Main {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();
        inventory.addItem("Laptop", 101, 5, 60000, null);
        inventory.addItem("Smartphone", 102, 10, 30000, null);
        inventory.addItem("Tablet", 103, 8, 20000, 0);
        inventory.displayItems();

        inventory.removeItem(102);
        System.out.println("After Deletion:");
        inventory.displayItems();

        inventory.updateQuantity(103, 12);
        System.out.println("After Quantity Update:");
        inventory.displayItems();

        System.out.println("Total Value of Inventory: " + inventory.calculateTotalValue());

        inventory.sortInventory("price", true);
        System.out.println("After Sorting by Price in Ascending Order:");
        inventory.displayItems();
    }

}
