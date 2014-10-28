package straits

trait W1 {
  def f(): String
}

trait W2 extends W1 {
  def f(): String = "W2.f"
}

trait W3 extends W1 {
  abstract override def f(): String = super.f() + " from W3"
}

trait W4 extends W1 {
  abstract override def f(): String = super.f() + " from W4"
}

class W5 extends W2 with W3
class W6 extends W2 with W3 with W4
class W7 extends W2 with W4 with W3

trait W8 extends W3 {
  abstract override def f(): String = super.f() + " from W8"
}

class W9 extends W2 with W8
class W10 extends W2 with W4 with W8
class W11 extends W2 with W8 with W4
class W12 extends W2 with W3 with W4 with W8
