package observer_observable.zad2.v2;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import lombok.*;

@ToString
@Getter
@Setter
public class ChatRoom {
    private String name;

    public SimpleObjectProperty<String> messageBox = new SimpleObjectProperty<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public void addUser (ChangeListener<String> user) {
        messageBox.addListener(user);
    }

    public void removeUser (ChangeListener<String> user) {
        messageBox.removeListener(user);
    }

    public void newMessage (String message) {
        messageBox.setValue(message);
    }
}
