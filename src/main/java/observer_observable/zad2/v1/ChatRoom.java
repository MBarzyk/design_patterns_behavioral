package observer_observable.zad2.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;

@Data
@AllArgsConstructor
public class ChatRoom extends Observable {
    private String name;

    public void sendMessage (String name, String message) {
        setChanged();
        notifyObservers(message);
    }

    public void addUser (User user) {
        addObserver(user);
    }
}
