// 코드 17-8 컬렉션을 JSON으로 바로 변환해서 HTTP 요청에 응답하는 방식

def list = Action {
  val jv = Json.toJson(memberList)
  Ok(jv)
}
