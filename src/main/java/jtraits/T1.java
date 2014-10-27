package jtraits;

public interface T1 {
    /**
     * default methods cannot be final, neither in java source, nor in the classfile: the spec (*)
     * says "Methods of interfaces may have any of the flags [..] set except [..], ACC_FINAL, [..]"
     *
     * (*) http://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4.html#jvms-4.6
     */
    /*final*/ default String f1() { return "T1.f1"; }
    
    default String f2() { return "T1.f2"; }

    String f3();
}
