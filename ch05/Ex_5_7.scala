// 코드 5-7 간단한 재귀함수를 이용해 계산하는 함수식

object Ex_5_7 {
  def main(args: Array[String]) = {
    val result = calc(x => x * x, 2, 5)
    println(result)
  }

  def calc(f: Int => Int, start: Int, end: Int) = {
    // 합계를 구하는 재귀 함수
    def loop(index: Int, sum: Int): Int = {
      if (index > end) sum  // 인덱스가 끝 값보다 크면 sum을 반환
      else loop(index + 1, f(index) + sum)  // 아니면 계속 더합니다.
    }

    loop(start, 0)  // 루프를 최초로 호출합니다.
  }
}
