// 코드 7-4 ::: 연산자를 이용한 리스트 병합

object Ex_7_4 {
  def main(args: Array[String]): Unit = {
    val list1 = "a" :: "b" :: "c" :: Nil
    val list2 = "d" :: "e" :: Nil
    val list0 = lsit1 ::: list2

    for(x <- 0 until list0.size)
      println(list0(x))
  }
}
