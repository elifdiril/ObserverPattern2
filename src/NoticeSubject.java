import java.util.ArrayList;
import java.util.List;

/**
 * @author Elif
 */
public class NoticeSubject implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private String message = "Notice... !";

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message);
        }
    }
}
