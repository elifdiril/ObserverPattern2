/**
 * @author Elif
 */
public class User1 implements Observer {

    private Subject observable;

    @Override
    public void notify(String message) {
        System.out.println(message + " User1 Mesaj Geldi.");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }

}
