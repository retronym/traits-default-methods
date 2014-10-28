package jtraits;

public class W9 implements W2, W8 {
    // Before default methods, the scala compiler would implement W8$super$f here. This is not
    // possible because `W3.f` is a default method (not a static method in W3$class), so it has to
    // be accessed as `W3.super.f`. This cannot be done here, because W9 doesn't implement W3.
    // Therefore, W8$super$f has a default implementation in W8.

    // public String W8$super$f() { return W3.super.f(); }
    public String W3$super$f() { return W2.super.f(); }
    public String f() { return W8.super.f(); }
}
