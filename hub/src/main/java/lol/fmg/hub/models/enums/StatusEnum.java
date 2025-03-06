package lol.fmg.hub.models.enums;

public enum StatusEnum {
    ACTIVE("Active"),
    PENDING("Pending"),
    BLOCKED("Blocked");

    private final String status;
    private StatusEnum(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}

