package Practice_assign;

enum PriorityLevel {
    LOW(1),
    MEDIUM(3),
    HIGH(5),
    CRITICAL(8);

    private final int severityCode;

    PriorityLevel(int severityCode) {
        this.severityCode = severityCode;
    }

    public int getSeverityCode() {
        return severityCode;
    }

    public boolean isUrgent() {
        return severityCode >= 5; // threshold for urgency
    }
}

public class PriorityTest {
    public static void main(String[] args) {
        for (PriorityLevel level : PriorityLevel.values()) {
            System.out.println(
                level.name() + " | Severity Code: " + level.getSeverityCode() +
                " | Urgent: " + level.isUrgent()
            );
        }
    }
}

