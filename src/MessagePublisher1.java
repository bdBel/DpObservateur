import java.util.ArrayList;
import java.util.List;

public class MessagePublisher1 implements Subject {
    //creer list de observés


    List<Observer> observers = new ArrayList();
    //List est Interfac et

    @Override
    public void attach(Observer o) {
observers.add(o);

    }

    @Override
    public void detach() {

    }

    public int getNumObservers() {
        return observers.size();
    }



    public void detach(Observer o) {
        observers.remove(o);

    }
// rajouter un final si on ne vetu pas pe le override
    @Override
    public void notifyUpdate(Message msg) {
        for (Observer o : observers) {
         o.update(msg);
        }
    }
}
