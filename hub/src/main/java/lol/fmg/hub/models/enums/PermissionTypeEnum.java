package lol.fmg.hub.models.enums;

public enum PermissionTypeEnum {

    WRITE("write"),
    READ("read"),
    CORRECT("correct"),
    CREATE_COMMENT("create comment"),
    DELETE_COMMENT("delete comment"),
    CREATED_ARTICLE("created article"),
    DELETE_ARTICLE("delete article");

    private final String label;
    private PermissionTypeEnum(String label) {
        this.label = label;
    }
    public String getlabel() {
        return label;
    }
}
