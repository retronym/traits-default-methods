package straits

trait T1 {
  final def f1(): String = "T1.f1"

  def f2(): String = "T1.f2"

  def f3(): String
}

trait T2 extends T1 {
  override def f2(): String = "T2.f2"

  def f3(): String = "T2.f3"
}
