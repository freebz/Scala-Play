// 코드 17-7 가족 멤버를 JsValue 형식으로 프로그램에서 바꾸는 메서드

import play.api.libs.json._
import play.api.libs.functional.syntax._

case calss Member(name : String, age : Int, job : String)

implicit val memberWrites : Writes[Member] = (
  (JsPath \ "family" \ "name").write[String] and
  (JsPath \ "family" \ "age").write[Int] and
  (JsPath \ "family" \ "job").write[String]
)(unlift(Member.unapply))
  // _표시는 JsPath와 동의어 입니다.

implicit val memberReads : Reads[Member] = (
  (JsPath \ "family" \ "name").read[String] and
  (JsPath \ "family" \ "age").read[Int] and
  (JsPath \ "family" \ "job").read[String]
)(Member.apply _)
