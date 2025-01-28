package SocialMediaFriendConnections;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SocialMediaNetwork network = new SocialMediaNetwork();
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 23);
        network.addUser(3, "Charlie", 27);
        network.addUser(4, "David", 22);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(3, 4);

        System.out.println("Displaying friends of Alice:");
        network.displayFriends(1);

        System.out.println("Mutual friends between Alice and Bob:");
        List<Integer> mutualFriends = network.findMutualFriends(1, 2);
        for (Integer friendId : mutualFriends) {
            UserNode friend = network.searchUserById(friendId);
            if (friend != null) {
                System.out.println("User ID: " + friend.userId + ", Name: " + friend.name);
            }
        }

        System.out.println("Counting number of friends for each user:");
        network.countFriends();

        network.removeFriendConnection(1, 2);
        System.out.println("After removing the friend connection between Alice and Bob:");
        network.displayFriends(1);
    }

}
