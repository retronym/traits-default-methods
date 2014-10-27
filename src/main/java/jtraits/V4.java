package jtraits;

public class V4 implements V2, V3 {
    public String f() { return V3.super.f(); }
}
