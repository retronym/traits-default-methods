package jtraits;

public interface X3 {
    default String h() { return ((X2)this).g() + " from X3"; }
}
