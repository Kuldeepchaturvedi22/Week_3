package hashmapsandhashfunctions.implementtionofcustomhashmap;

public class Main {
    public static void main(String[] args) {
        // Create a custom hash map with a size of 10
        CustomHashMap customHashMap = new CustomHashMap(10);

        // Insert key-value pairs into the hash map
        customHashMap.put("name", "John");
        customHashMap.put("age", "30");
        customHashMap.put("city", "New York");

        // Retrieve and print values based on keys
        System.out.println("Name: " + customHashMap.get("name"));
        System.out.println("Age: " + customHashMap.get("age"));
        System.out.println("City: " + customHashMap.get("city"));

        // Update a value and print it
        customHashMap.put("age", "31");
        System.out.println("Updated Age: " + customHashMap.get("age"));

        // Delete a key-value pair
        customHashMap.remove("city");
        System.out.println("City after removal: " + customHashMap.get("city"));
    }
}
