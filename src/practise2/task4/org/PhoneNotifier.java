package practise2.task4.org;

public class PhoneNotifier implements Observer {
    private String phoneNumber;

    public PhoneNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("practise2.task4.org.PhoneNotifier [" + phoneNumber + "] received alert: " + alert.getMessage());
    }
}