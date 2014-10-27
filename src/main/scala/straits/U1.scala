package straits

trait U1 {
  var s: String = "U1.s"
}

class U2 extends U1 {
  def m() = s + { s = "!!"; s }
}
