// 코드 15-11 controllers/Application.scala/edit

def edit(id: Long) = Action {
  Computer.findById(id).map { computer =>
    Ok(html.editForm(id, computerForm.fill(computer), Company.options))
  }.getOrElse(NotFound)
}
