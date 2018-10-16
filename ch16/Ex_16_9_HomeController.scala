// 코드 18-9 controllers/HomeController

package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.MemberDataAccess
import scala.concurrent.ExecutionContext

@Singleton
class HomeController @Inject() (md: MemberDataAccess)(implicit ec:
    ExecutionContext) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def memberCreate = Action {
    md.create
    Ok(views.html.index("created"))
  }

  def memberInsert = Action {
    md.insert
    Ok(views.html.index("Inserted"))
  }

  def memberSelect = Action.async {
    md.getList map { m =>
      Ok(views.html.list(m))
    }
  }

}
