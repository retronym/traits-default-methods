package jtraits;


public interface T2 extends T1 {

    // default methods can override, virtual dispatch
    @Override
    default String f2() { return "T2.f2"; }

    default String f3() { return "T2.f3"; }
}
