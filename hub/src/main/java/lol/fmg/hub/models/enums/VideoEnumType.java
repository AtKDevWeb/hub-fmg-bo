package lol.fmg.hub.models.enums;

public enum VideoEnumType {

    MP4(".mp4"),
    MKV(".mkv"),
    MOV(".mov"),
    WEBM(".webm"),

    private final String label;

    VideoEnumType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

