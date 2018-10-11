// 코드 14-4 controllers/HomeController.scala/save 메서드

def save = Action { implicit request =>
  val form = joinForm.bindFromRequest()
  form.fold(
    hasErrors => {
      println(hasErrors)
      Rediredirect(routes.HomeController.form)
    },
    member => {
      ms.insert(member)
      Redirect(routes.HomeController.list)
    }
  )

}
