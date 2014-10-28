package jtraits;

public interface W8 extends W3 {
    // Need default here: classes implementing W8 (but not W3) cannot access W3.super. See W9.
    default String W8$super$f() { return W3.super.f(); }
    default String f() { return W8$super$f() + " from W8"; }
}
