// 코드 7-3 :: 연산자를 이용한 리스트 생성과 출력

object Ex_7_3 {
  def main(args: Array[String]): Unit = {
    val list = "a" :: "b" :: "c" :: Nil
    for(x <- 0 until list.size)
      println(list(x))
  }
}
