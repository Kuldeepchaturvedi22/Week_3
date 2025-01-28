package SocialMediaFriendConnections;

import java.util.List;
import java.util.ArrayList;

public class SocialMediaNetwork {
    private UserNode head;

    public SocialMediaNetwork() {
        this.head = null;
    }

    // Add a new user to the network
    public void addUser(int userId, String name, int age) {
        UserNode newNode = new UserNode(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            UserNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = searchUserById(userId1);
        UserNode user2 = searchUserById(userId2);
        if (user1 != null && user2 != null && userId1 != userId2) {
            if (!user1.friendIds.contains(userId2)) {
                user1.friendIds.add(userId2);
            }
            if (!user2.friendIds.contains(userId1)) {
                user2.friendIds.add(userId1);
            }
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = searchUserById(userId1);
        UserNode user2 = searchUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    // Find mutual friends between two users
    public List<Integer> findMutualFriends(int userId1, int userId2) {
        List<Integer> mutualFriends = new ArrayList<>();
        UserNode user1 = searchUserById(userId1);
        UserNode user2 = searchUserById(userId2);
        if (user1 != null && user2 != null) {
            for (Integer friendId1 : user1.friendIds) {
                if (user2.friendIds.contains(friendId1)) {
                    mutualFriends.add(friendId1);
                }
            }
        }
        return mutualFriends;
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        UserNode user = searchUserById(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ":");
            for (Integer friendId : user.friendIds) {
                UserNode friend = searchUserById(friendId);
                if (friend != null) {
                    System.out.println("User ID: " + friend.userId + ", Name: " + friend.name + ", Age: " + friend.age);
                }
            }
        }
    }

    // Search for a user by Name
    public UserNode searchUserByName(String name) {
        UserNode current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Search for a user by User ID
    public UserNode searchUserById(int userId) {
        UserNode current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Count the number of friends for each user
    public void countFriends() {
        UserNode current = head;
        while (current != null) {
            System.out.println("User ID: " + current.userId + ", Name: " + current.name + " has " + current.friendIds.size() + " friends.");
            current = current.next;
        }
    }

}
