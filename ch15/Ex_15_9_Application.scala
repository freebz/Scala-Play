// 코드 15-9 controllers/Application.scala/computerForm

val computerForm = Form(
  mapping(
    "id" -> ignored(None: Option[Long]),
    "name" -> nonEmptyText,
    "introduced" -> optional(date("yyyy-MM-dd")),
    "discontinued" -> optional(date("yyyy-MM-dd")),
    "company" -> optional(longNumber)
  )(Computer.apply)(Computer.unapply)
)
