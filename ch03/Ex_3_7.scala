// 코드 3-7 전형적인 이중 for 문

object Ex_3_7 {
  def main(args: Array[String]): Unit = {
    for(x <- 1 until 5) {
      for(y <- 1 until 5) {
        print(x + " * " + y + " = " + x * y + "|")
      }
    }
  }
}
