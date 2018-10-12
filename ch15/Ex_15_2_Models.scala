// 코드 15-2 models/Models.scala/object Company.somple

object Company {
  val simple = {
    get[Option[Long]]("company.id") ~
    get[String]("company.name") map { }

  }
}
