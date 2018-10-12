// 코드 15-10 controllers/Application.scala/list

def list(page: Int, orderBy: Int, filter: String) = Action {
  implicit request =>
  Ok(html.list(
    Computer.list(page = page, orderBy = orderBy,
      filter = ("%"+filter+"%")), orderBy, filter
  ))
}
