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

trait V6 extends V2 {
  override def f(): String = super.f()
}

class V7 extends V3 with V6 // "V2.f"
class V8 extends V6 with V3// "V3.f"
