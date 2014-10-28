package jtraits;

public interface W3 extends W1 {
    String W3$super$f();
    default String f() { return W3$super$f() + " from W3"; }
}
