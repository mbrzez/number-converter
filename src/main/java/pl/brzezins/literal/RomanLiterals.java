package pl.brzezins.literal;

public enum RomanLiterals {
    M(1000), D(500), C(100), L(50), X(10), V(5), I(1);

    private int value;

    RomanLiterals(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
