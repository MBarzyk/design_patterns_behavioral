package observer_observable.zad2.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
@AllArgsConstructor
public class User implements Observer {
    private String nick;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String message = (String) arg;
            System.out.println(nick + ": WOW, CAN'T BELIEVE IT!" + message);
        } else {
            System.out.println(nick + ": WTF IS DIS " + arg.toString());
        }
    }
}
