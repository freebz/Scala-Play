// 코드 5-3 드랍십에 사람을 태우는 코드

object Ex_5_3 {
  def main(args: Array[String]) = {
    dropship(people(5))
  }

  def people(n: Int) = {
    println("탑승수속을 시작합니다.")
    n
  }

  def dropship(n: Int) = {
    println("드랍쉽을 준비합니다.")
    println(n + "명 탑승했습니다.")
  }
}
