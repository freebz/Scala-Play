// 코드 8-1 map() 메서드

object Ex_8_1 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    println(o)
    val n = o.map(i => i * 10)
    println(n)
  }
}
