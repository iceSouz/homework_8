package homework;

public enum Color {
    RED("#f00"),
    WHITE("fff"),
    BLUE("#00f"),
    YELLOW("ff0"),
    BLACK("#000"),
    ORANGE("#ffa500");

    private String hex;

    Color(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
