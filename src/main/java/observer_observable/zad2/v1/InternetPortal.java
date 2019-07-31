package observer_observable.zad2.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternetPortal {
    private List<ChatRoom> chatRooms = new ArrayList<>();

    public void addChatroom(ChatRoom... rooms) {
        chatRooms.addAll(Arrays.asList(rooms));
    }

    public void removeChatroom (ChatRoom room) {
        chatRooms.remove(room);
    }

    public void listChatrooms () {
        chatRooms.forEach(System.out::println);
    }
}