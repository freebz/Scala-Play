// 코드 20-4 controller에서 메시지를 보내는 과정

import play.api.i18n.Messages

def index = Action { implicit request =>
  val greeting = Messages("welcome.greeting")
  Ok(views.html.index(greeting))
}
