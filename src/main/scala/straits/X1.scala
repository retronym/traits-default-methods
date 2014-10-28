package straits

trait X1 {
  def f(): String
}

trait X2 { self: X1 =>
  def g(): String = f() + " from X2"
}

trait X3 { self: X1 with X2 =>
  def h(): String = g() + " from X3"
}

class X4 extends X1 with X2 with X3 {
  def f(): String = "X4.f"
}
