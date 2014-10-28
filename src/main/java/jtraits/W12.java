package jtraits;

public class W12 implements W2, W3, W4, W8 {
    // Override the default
    @Override
    public String W8$super$f() { return W4.super.f(); }

    public String W3$super$f() { return W2.super.f(); }

    // The expected way to implement the `W4$super$f` accessor would be to invoke `W3.super.f`, but
    // that doesn't compile with javac. Not sure if that is a bug in the Java compiler. Also not
    // sure if it would "just work" if we emitted an INVOKESPECIAL to W3.f in the bytecode.
    // The compiler error message is
    //   error: bad type qualifier W3 in default super call
    //   redundant interface W3 is extended by W8
    //
    // As a workaround, we invoke the W8$super accessor, which (by chance) happens to invoke the
    // W3.f that we need here. If the bytecode would not allow invoking W3.f here, we'd need to find
    // a generic solution for this.

    // public String W4$super$f() { return W3.super.f(); }
    public String W4$super$f() { return W8.super.W8$super$f(); }

    public String f() { return W8.super.f(); }
}
