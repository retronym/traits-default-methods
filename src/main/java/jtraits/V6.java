package jtraits;

public interface V6 extends V2 {
    @Override
    default String f() { return V2.super.f(); }
}
