// 코드 5-6 val 변수에 함수 넣기

object Ex_5_6 {
  def main(args: Array[String]) = {
    val g = f _
    println(f(1))
  }

  def f(i: Int) = i
}
