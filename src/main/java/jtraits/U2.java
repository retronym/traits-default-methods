package jtraits;

public class U2 implements U1 {
    private String s;
    public String s() { return s; }
    public void s$underscore$eq(String v) { s = v; }

    public U2() {
        super();
        U1.$init$(this);
    }

    public String m() {
        String r = s;
        s$underscore$eq("!!");
        r = r + s;
        return r;
    }
}
