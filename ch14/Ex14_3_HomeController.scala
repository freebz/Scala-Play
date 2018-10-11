// 코드 14-3 controllers/Homecontroller.scala/save 메서드

def save = Action { implicit request =>
  val newJoinForm = joinForm.bindFromRequest()
  newJoinForm.fold(hasErrors, success)
}
