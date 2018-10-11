// 코드 14-1 controllers/HomeController.scala

import play.api.data._
import play.api.data.Forms._
import play.api.i18n.Messages.Implicits._
import play.api.Play.current

val joinForm = Form(
  mapping(
    "mid" -> ignored(0),
    "userid" -> nonEmptyText,
    "password" -> nonEmptyText,
    "nickname" -> nonEmptyText,
    "email" -> nonEmptyText,
    "regdate" -> optional(date("yyyy-MM-dd"))
  )(models.Member.apply)(models.Member.unapply _))

def form = Action {
  Ok(views.html.form(joinForm))
}
