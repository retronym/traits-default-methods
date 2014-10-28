package jtraits;

public interface X2 {
    default String g() { return ((X1)this).f() + " from X2"; }
}
