package jtraits;

public class W6 implements W2, W3, W4 {
    public String W3$super$f() { return W2.super.f(); }
    public String W4$super$f() { return W3.super.f(); }
    public String f() { return W4.super.f(); }
}
