// 코드 20-8 매개변수를 받는 message 설정

def index = Action { implicit request =>
  val greeting = Messages("welcome.greeting"," 방가방가","!")
  Ok(views.html.index(greeting))
}
