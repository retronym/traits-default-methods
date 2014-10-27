package straits

trait V1 {
  def f(): String
}

trait V2 extends V1 {
  override def f(): String = "V2.f"
}

trait V3 extends V1 {
  override def f(): String = "V3.f"
}

class V4 extends V2 with V3
class V5 extends V3 with V2
