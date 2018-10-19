// 코드 18-7 JSON 문자열을 받아 패턴매칭하여 객체로 변환

def receive = {
  case str:String => Json.parse(str)
      (json \ "type").as[String] match {
        case "join" => self ! Join( (json \ "username").as[String] )
        case "leave" => self ! Leave( (json \ "username").as[String] )
        case "talk" => self ! Talk( (json \ "username").as[String], (json \ "msg").as[String] )
      }
}
