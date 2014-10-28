package jtraits;

public class W5 implements W2, W3 {
    public String W3$super$f() { return W2.super.f(); }
    public String f() { return W3.super.f(); }
}
