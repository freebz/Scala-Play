// 코드 8-3 foldLeft() 메서드

object Ex_8_3 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.foldLeft(0)((i, j) => i + j)
    println(n)
  }
}
