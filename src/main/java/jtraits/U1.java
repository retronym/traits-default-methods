package jtraits;

public interface U1 {
    String s();
    void s$underscore$eq(String v);

    static void $init$(U1 instance) {
        instance.s$underscore$eq("U1.s");
    }
}
