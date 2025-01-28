package InventoryManagementSystem;

public class InventoryLinkedList {
    private ItemNode head;

    public InventoryLinkedList() {
        this.head = null;
    }

    // Add an item at the beginning, end, or a specific position
    public void addItem(String itemName, int itemId, int quantity, double price, Integer position) {
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        if (position == null) {  // Add at end
            if (head == null) {
                head = newNode;
            } else {
                ItemNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        } else if (position == 0) {  // Add at beginning
            newNode.next = head;
            head = newNode;
        } else {  // Add at specific position
            ItemNode current = head;
            int count = 0;
            while (current != null && count < position - 1) {
                current = current.next;
                count++;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Remove an item based on Item ID
    public void removeItem(int itemId) {
        ItemNode current = head;
        ItemNode prev = null;
        while (current != null && current.itemId != itemId) {
            prev = current;
            current = current.next;
        }
        if (current != null) {  // Item found
            if (prev != null) {
                prev.next = current.next;
            } else {
                head = current.next;
            }
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        ItemNode item = searchItemById(itemId);
        if (item != null) {
            item.quantity = newQuantity;
        }
    }

    // Search for an item based on Item ID or Item Name
    public ItemNode searchItemById(int itemId) {
        ItemNode current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public ItemNode searchItemByName(String itemName) {
        ItemNode current = head;
        while (current != null) {
            if (current.itemName.equals(itemName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Calculate and display the total value of inventory
    public double calculateTotalValue() {
        double totalValue = 0.0;
        ItemNode current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        return totalValue;
    }

    // Display all items
    public void displayItems() {
        ItemNode current = head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }

    // Sort the inventory based on Item Name or Price
    public void sortInventory(String criterion, boolean ascending) {
        if (head == null || head.next == null) return;

        head = mergeSort(head, criterion, ascending);
    }

    private ItemNode mergeSort(ItemNode head, String criterion, boolean ascending) {
        if (head == null || head.next == null) return head;

        ItemNode middle = getMiddle(head);
        ItemNode nextToMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(head, criterion, ascending);
        ItemNode right = mergeSort(nextToMiddle, criterion, ascending);

        return sortedMerge(left, right, criterion, ascending);
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;

        ItemNode slow = head;
        ItemNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ItemNode sortedMerge(ItemNode left, ItemNode right, String criterion, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;

        ItemNode result;

        int comparison = 0;
        if (criterion.equals("name")) {
            comparison = left.itemName.compareTo(right.itemName);
        } else if (criterion.equals("price")) {
            comparison = Double.compare(left.price, right.price);
        }

        if ((ascending && comparison <= 0) || (!ascending && comparison > 0)) {
            result = left;
            result.next = sortedMerge(left.next, right, criterion, ascending);
        } else {
            result = right;
            result.next = sortedMerge(left, right.next, criterion, ascending);
        }
        return result;
    }

}
