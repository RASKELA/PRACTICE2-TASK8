package practise2.task4.org;

public class EmailNotifier implements Observer {
    private String uniqueName;

    public EmailNotifier(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("practise2.task4.org.EmailNotifier [" + uniqueName + "] received alert: " + alert.getMessage());
    }
}