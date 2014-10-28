package jtraits;

public class W11 implements W2, W8, W4 {
    // Not needed, see W9.
    // public String W8$super$f() { return W3.super.f(); }

    public String W3$super$f() { return W2.super.f(); }
    public String W4$super$f() { return W8.super.f(); }
    public String f() { return W4.super.f(); }
}
