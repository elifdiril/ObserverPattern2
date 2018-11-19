/**
 * @author Elif
 */
public class User2 implements Observer {

    private Subject observable;

    public User2() {
    }

    public void setObservable(Subject observable) {
        this.observable = observable;
    }

    @Override
    public void notify(String message) {
        System.out.println(message + " User2 Mesaj Geldi.");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }

}
