// 코드 8-5 zip() 메서드

object Ex_8_5 {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val oo = List(5, 6, 7, 8, 9)

    val n = o zip oo
    val nn = o ::: oo

    println(n)
    println(nn)
  }
}
