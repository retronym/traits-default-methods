package jtraits;

public interface V2 extends V1 {
    @Override
    default String f() { return "V2.f"; }
}
