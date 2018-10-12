// 코드 15-12 controllers/Application.scala/update

def update(id: Long) = Action { implicit request =>
  computerForm.bindFromRequest.fold(
    formWithErrors =>
      BadRequest(html.editForm(id, formWithErrors, Company.options)),
    computer => {
      Computer.update(id, computer)
      Home.flashing("success" -> "Computer %s has been updated".
        format(computer.name))
    }
  )
}
