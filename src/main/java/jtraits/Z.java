package jtraits;

public class Z {
    public interface Z0 {
        String f();
    }
    public static class Z1 implements Z0 {
        public String f() {return "Z1.f";}
    }
    public interface Z2 extends /*Z1*/ Z0 {
        default String f() { return "Z2.f"; }
    }
    public interface Z3 extends Z2 {
        default String f() {return Z2.super.f();}
    }
    public static class ZMix extends Z1 implements Z.Z3 {}

}
