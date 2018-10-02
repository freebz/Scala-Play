// 코드 5-10 apply() 메서드 이용하기

object Ex_5_10 {
  class SomeClass {
    def apply(m: Int) = method(m)
    def method(i: Int) = i + i
    def method2(s: String) = s
  }

  def main(args: Array[String]) = {
    val something = new SomeClass

    println(something(2))
  }
}
