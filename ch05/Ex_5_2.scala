// 코드 5-2 간단한 덧셈을 하는 함수

object Ex_5_2 {
  def main(args: Array[String]) = {
    val result = sum(1, 2)
    println(result)
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }
}
