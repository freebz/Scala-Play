// 코드 18-12 Controller 기본 루트 구현

def chatStart = Action { request =>
  Ok(views.html.chat(request))
}
