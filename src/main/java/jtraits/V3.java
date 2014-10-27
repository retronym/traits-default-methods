package jtraits;

public interface V3 extends V1 {
    @Override
    default String f() { return "V3.f"; }
}
