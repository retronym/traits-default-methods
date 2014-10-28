package traits

import org.junit.{Assert, Test}
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import Assert._

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
    assertTrue(jV4.f() == sV4.f())
    assertTrue(jV5.f() == sV5.f())

    val jV7 = new jtraits.V7
    val jV8 = new jtraits.V8
    val sV7 = new straits.V7
    val sV8 = new straits.V8
    assertTrue(jV7.f() == sV7.f())
    assertTrue(jV8.f() == sV8.f())
  }
}
