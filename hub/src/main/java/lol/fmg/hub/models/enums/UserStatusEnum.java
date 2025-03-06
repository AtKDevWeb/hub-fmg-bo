package lol.fmg.hub.models.enums;

public enum UserStatusEnum {

    ADMINISTRATOR("Administrator"),
    MODERATOR("Moderator"),
    EDITOR("Editor"),
    USER("User"),
    VISITOR("Visitor");

    private String label;
    UserStatusEnum(String label) {
        this.value = label;
    }
    public String getlabel() {
        return label;
    }
}
