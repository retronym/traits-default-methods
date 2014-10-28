package jtraits;

public interface W4 {
    String W4$super$f();
    default String f() { return W4$super$f() + " from W4"; }
}
