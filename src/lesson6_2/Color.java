package lesson6_2;

public enum Color {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m");

    String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
