
package observer_observable.zad2.v2;

import java.util.*;

public class InternetPortal {
    private Map<String, ChatRoom> chatRooms = new HashMap<>();

    public void addChatroom(String name, ChatRoom room) {
        chatRooms.put(name, room);
    }

    public void removeChatroom (ChatRoom room) {
        chatRooms.remove(room.getName());
    }

    public void listChatrooms () {
        chatRooms.forEach((key, value) -> System.out.println("Nazwa roomu: " + key));
    }

    public void sendMessageToRoom (String name, String message) {
        chatRooms.get(name).newMessage(message);
    }
}