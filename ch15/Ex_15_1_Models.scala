// 코드 15-1 models/Models.scala/object Computer.simple

val simple = {
  get[Option[Long]]("computer.id") ~
  get[String]("computer.name") ~
  get[Option[Date]]("computer.introduced") ~
  get[Option[Date]]("computer.discontinued") ~
  get[Option[Long]]("computer.company_id") map {
    case id~name~introduced~discontinued~companyId =>
      Computer(id, name, introduced, discontinued, companyId)
  }
}
