package practise2.task4.org;

import java.time.LocalDateTime;

public class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int executionCode;
    private LocalDateTime timestamp;
    private String process;

    public SystemAlert(AlertSeverity severity, String message, int executionCode, LocalDateTime timestamp, String process) {
        this.severity = severity;
        this.message = message;
        this.executionCode = executionCode;
        this.timestamp = timestamp;
        this.process = process;
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getExecutionCode() {
        return executionCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getProcessName() {
        return process;
    }
}
