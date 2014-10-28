package jtraits;

public class W7 implements W2, W4, W3 {
    public String W3$super$f() { return W4.super.f(); }
    public String W4$super$f() { return W2.super.f(); }
    public String f() { return W3.super.f(); }
}
