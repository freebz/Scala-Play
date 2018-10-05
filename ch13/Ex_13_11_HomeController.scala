// 코드 13-11 controllers/HomeController.scala

package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.MemberService

@Singleton
class HomeController @Inject()(ms : MemberService) extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def list = Action {
    Ok(views.html.list(ms.getList))
  }
}

