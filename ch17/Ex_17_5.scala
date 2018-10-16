// 코드 17-5 User 객체와 JsValue 변환

case class User(id: Long, name: String, friends: List[User])

implicit object UserFormat extends Format[User] {
  def reads(jv: JsValue): User = User(
    (jv \ "id").as[Long],
    (jv \ "name").as[String],
    (jv \ "friends").asOpt[List[User]].getOrElse(List()))

  def writes(u: User): JsValue = JsObject(List(
    "id" -> JsNumber(u.id),
    "name" -> JsString(u.name),
    "friends" -> JsArray(u.friends.map(fr => JsObject(List("id" -> JsNumber(fr.id),
      "name" -> JsString(fr.name)))))))
}
