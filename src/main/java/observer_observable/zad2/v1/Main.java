package observer_observable.zad2.v1;

public class Main {
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

        portal.addChatroom(chatRoom1, chatRoom2, chatRoom3, chatRoom4);
        portal.listChatrooms();

        System.out.println("Chat " + chatRoom1.getName());
        chatRoom1.sendMessage(chatRoom1.getName(), "PONCZKI W LIDLU ZA PISIONT GROSZY");
        System.out.println("Chat " + chatRoom2.getName());
        chatRoom2.sendMessage(chatRoom2.getName(), "OMG NOWE SKURKI DO POSTACI!");
        System.out.println("Chat " + chatRoom3.getName());
        chatRoom3.sendMessage(chatRoom3.getName(), "OMG, VIAGRA PO TRZY PISIONT");
        System.out.println("Chat " + chatRoom4.getName());
        chatRoom4.sendMessage(chatRoom4.getName(), "ZLOKALIZOWANO WYJŚCIE Z PIWNICY");
    }
}
