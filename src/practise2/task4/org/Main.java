package practise2.task4.org;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SystemController controller = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("ss.corobruh@gmail.com");
        TelegramNotifier telegramNotifier = new TelegramNotifier("@raskela", true);
        PhoneNotifier phoneNotifier = new PhoneNotifier("+380975194364");
        SysLogNotifier sysLogNotifier = new SysLogNotifier("SystemLog");

        controller.subscribe(emailNotifier);
        controller.subscribe(telegramNotifier);
        controller.subscribe(phoneNotifier);
        controller.subscribe(sysLogNotifier);

        SystemAlert alert = new SystemAlert(AlertSeverity.ERROR, "Test Alert", 101, LocalDateTime.now(), "TestProcess");
        controller.addAlert(alert);
    }
}