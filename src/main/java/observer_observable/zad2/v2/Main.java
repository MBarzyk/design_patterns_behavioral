package observer_observable.zad2.v2;

public class Main {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {

        InternetPortal portal = new InternetPortal();
        ChatRoom chatRoom1 = new ChatRoom("18+");
        ChatRoom chatRoom2 = new ChatRoom("FoRtNiTe_cLuB");
        ChatRoom chatRoom3 = new ChatRoom("Dziady");
        ChatRoom chatRoom4 = new ChatRoom("programisci");

        User user1 = new User("Didżej18");
        User user2 = new User("Amanda99");
        User user3 = new User("Krul69");
        User user4 = new User("rozowy30cm");
        User user5 = new User("Kapitan_planeta");
        User user6 = new User("Troskliwy_Miś");

        chatRoom1.addUser(user1);
        chatRoom2.addUser(user2);
        chatRoom3.addUser(user3);
        chatRoom1.addUser(user4);
        chatRoom4.addUser(user5);
        chatRoom4.addUser(user6);

        portal.addChatroom(chatRoom1.getName(), chatRoom1);
        portal.addChatroom(chatRoom2.getName(), chatRoom2);
        portal.addChatroom(chatRoom3.getName(), chatRoom3);
        portal.addChatroom(chatRoom4.getName(), chatRoom4);
        portal.listChatrooms();

        portal.sendMessageToRoom("programisci", "wyjscie z piwnicy: ZNALEZIONE!");



    }
}
