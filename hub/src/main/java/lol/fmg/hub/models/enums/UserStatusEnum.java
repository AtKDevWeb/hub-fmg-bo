package lol.fmg.hub.models.enums;

public enum UserStatusEnum {

    ADMINISTRATOR("Administrator"),
    MODERATOR("Moderator"),
    EDITOR("Editor"),
    USER("User"),
    VISITOR("Visitor");

    private final String label;
    UserStatusEnum(String label) {
        this.label = label;
    }
    public String getlabel() {
        return label;
    }
}
