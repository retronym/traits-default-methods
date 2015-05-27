package traits

import jtraits.Z
import jtraits.Z.Z1
import org.junit.{Assert, Test}
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import Assert._
import straits.Z3

@RunWith(classOf[JUnit4])
class T1Test {
  @Test
  def t1(): Unit = {
    val jT1 = new jtraits.T1 {
      def f3() = "T1.f3"
    }
    val sT1 = new straits.T1 {
      def f3() = "T1.f3"
    }
    assertTrue(jT1.f1() == sT1.f1())
    assertTrue(jT1.f2() == sT1.f2())
    assertTrue(jT1.f3() == sT1.f3())
  }

  @Test
  def t2(): Unit = {
    val jT2 = new jtraits.T2 { }
    val sT2 = new straits.T2 { }

    assertTrue(jT2.f1() == sT2.f1())
    assertTrue(jT2.f2() == sT2.f2())
    assertTrue((jT2: jtraits.T1).f2() == (sT2: straits.T1).f2())
    assertTrue(jT2.f3() == sT2.f3())
  }

  @Test
  def u(): Unit = {
    val jU = new jtraits.U2
    val sU = new straits.U2
    assertTrue(jU.m() == sU.m())
  }

  @Test
  def v(): Unit = {
    val jV4 = new jtraits.V4
    val jV5 = new jtraits.V5
    val sV4 = new straits.V4
    val sV5 = new straits.V5
    assertTrue(sV4.f() == "V3.f")
    assertTrue(sV5.f() == "V2.f")
    assertTrue(jV4.f() == sV4.f())
    assertTrue(jV5.f() == sV5.f())

    val jV7 = new jtraits.V7
    val jV8 = new jtraits.V8
    val sV7 = new straits.V7
    val sV8 = new straits.V8
    assertTrue(sV7.f() == "V2.f")
    assertTrue(sV8.f() == "V3.f")
    assertTrue(jV7.f() == sV7.f())
    assertTrue(jV8.f() == sV8.f())
  }

  @Test
  def w(): Unit = {
    val sW5  = new straits.W5
    val sW6  = new straits.W6
    val sW7  = new straits.W7
    val sW9  = new straits.W9
    val sW10 = new straits.W10
    val sW11 = new straits.W11
    val sW12 = new straits.W12
    val jW5  = new jtraits.W5
    val jW6  = new jtraits.W6
    val jW7  = new jtraits.W7
    val jW9  = new jtraits.W9
    val jW10 = new jtraits.W10
    val jW11 = new jtraits.W11
    val jW12 = new jtraits.W12
    assertTrue(sW5.f()  == "W2.f from W3")
    assertTrue(sW6.f()  == "W2.f from W3 from W4")
    assertTrue(sW7.f()  == "W2.f from W4 from W3")
    assertTrue(sW9.f()  == "W2.f from W3 from W8")
    assertTrue(sW10.f() == "W2.f from W4 from W3 from W8")
    assertTrue(sW11.f() == "W2.f from W3 from W8 from W4")
    assertTrue(sW12.f() == "W2.f from W3 from W4 from W8")
    assertTrue(jW5.f()  == sW5.f())
    assertTrue(jW6.f()  == sW6.f())
    assertTrue(jW7.f()  == sW7.f())
    assertTrue(jW9.f()  == sW9.f())
    assertTrue(jW10.f() == sW10.f())
    assertTrue(jW11.f() == sW11.f())
    assertTrue(jW12.f() == sW12.f())
  }

  @Test
  def x(): Unit = {
    val sX4 = new straits.X4
    val jX4 = new jtraits.X4
    assertTrue(sX4.h() == "X4.f from X2 from X3")
    assertTrue(jX4.h() == sX4.h())
  }

  @Test
  def z(): Unit = {
    assertEquals("Z2.f", (new Z.ZMix).f) // fails, Z1.f
    assertEquals("Z2.f", new straits.Z3 {}.f)
  }

}
