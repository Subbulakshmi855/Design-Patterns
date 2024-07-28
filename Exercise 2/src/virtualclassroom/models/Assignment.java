package virtualclassroom.models;

public class Assignment {
    private final String details;
    private final String submittedBy;

    public Assignment(String details, String submittedBy) {
        this.details = details;
        this.submittedBy = submittedBy;
    }

    public String getDetails() {
        return details;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }
}
