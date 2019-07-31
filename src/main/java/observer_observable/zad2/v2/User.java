package observer_observable.zad2.v2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements ChangeListener<String> {
    private String nick;

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        System.out.println(nick + ": WOW, CAN'T BELIEVE IT!:  " + newValue);
    }
}
