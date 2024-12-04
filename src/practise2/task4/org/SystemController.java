package practise2.task4.org;

import java.util.ArrayList;
import java.util.List;

public class SystemController {
    private List<SystemAlert> alertHistory;
    private List<Observer> observers;

    public SystemController() {
        this.alertHistory = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void informAlerts() {
        for (Observer observer : observers) {
            for (SystemAlert alert : alertHistory) {
                observer.notify(alert);
            }
        }
    }

    public void addAlert(SystemAlert alert) {
        alertHistory.add(alert);
        for (Observer observer : observers) {
            observer.notify(alert);
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
}