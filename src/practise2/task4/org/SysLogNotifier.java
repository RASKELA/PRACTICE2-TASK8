package practise2.task4.org;

public class SysLogNotifier implements Observer {
    private String journalName;

    public SysLogNotifier(String journalName) {
        this.journalName = journalName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("practise2.task4.org.SysLogNotifier [" + journalName + "] received alert: " + alert.getMessage());
    }
}