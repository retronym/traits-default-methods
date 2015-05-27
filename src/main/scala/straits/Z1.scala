package straits

trait Z0 {
  def f(): String
}

class Z1 extends Z0 {
  override def f(): String = "Z1.f"
}
trait Z2 extends Z1 {
  override def f(): String = "Z2.f"
}
trait Z3 extends Z2 {
  override def f(): String = super[Z2].f()
}
