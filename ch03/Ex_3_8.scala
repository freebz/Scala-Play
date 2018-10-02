// 코드 3-8 스칼라식 이중 for 문

object Ex_3_8 {
  def main(args: Array[String]): Unit = {
    for(x <- 1 until 5; y <- 1 until 5) {
      print(x + " * " + y + " = " + x * y + "|")
    }
  }
}
