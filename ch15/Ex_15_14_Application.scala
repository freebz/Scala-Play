// 코드 15-14 controllers/Application.scala/save

def save = Action { implicit request =>
  computerForm.bindFromRequest.fold(
    formWithErrors =>
      BadRequest(html.createForm(formWithErrors, Company.options)),
    computer => {
      Computer.insert(computer)
      Home.flashing("success" ->
        "Computer %s has been created".format(computer.name))
    }
  )
}
