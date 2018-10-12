// 코드 15-15 controllers/Application.scala/delete

def delete(id: Long) = Action {
  Computer.delete(id)
  Home.flashing("success" -> "Computer has been deleted")
}
