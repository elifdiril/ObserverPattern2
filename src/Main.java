/**
 * @author Elif
 */
public class Main {

    public static void main(String[] args) {

        User1 user1 = new User1();
        User2 user2 = new User2();

        NoticeSubject noticeObservable = new NoticeSubject();

        user2.setObservable(noticeObservable);

        noticeObservable.addObserver(user1);
        noticeObservable.addObserver(user2);
        noticeObservable.notifyObserver();

        user2.removeObserver();
        noticeObservable.notifyObserver();

    }
}
