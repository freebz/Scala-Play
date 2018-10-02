// 코드 5-1 반환 자료형을 명시적으로 선하지 않은 함수

object Ex_5_1 {
  def main(args: Array[String]) = {
    println("반환받는 값 : " + name())
  }

  def name() = {
    val a = 10
    a
  }
}
