package pl.brzezins.literal;

public enum RomanLiteral {
    M(1000), D(500), C(100), L(50), X(10), V(5), I(1);

    private int value;

    RomanLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int getValueOfChar(char c) {
        return RomanLiteral.valueOf(Character.toString(c)).getValue();
    }
}
