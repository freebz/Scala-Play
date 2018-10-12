// 코드 15-13 controllers/Application.scala/create

def create = Action {
  Ok(html.createForm(computerForm, Company.options))
}
