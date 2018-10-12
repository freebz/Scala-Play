// 코드 15-3 models/Models.scala/object Computer.withCompany

val withCompany = Computer.simple ~ (Company.simple ?) map {
  case computer~company => (computer, company)
}
