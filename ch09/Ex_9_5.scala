// 코드 9-5 파일 출력

import scala.io.StdIn.readLine
import java.io.File
import java.io.PrintWriter

object Ex_9_5 {
  def main(args: Array[String]): Unit = {
    val fileName = "Ex_9_5_result.txt"
    var input = readLine("파일에 쓸 내용을 입력하세요: ")

    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close

    // 출력 파일은 패키지 디렉터리에 생성됩니다.
    println("입력하신 " + input + " 텍스트를 " + fileName + "에 저장했습니다.")
  }
}
