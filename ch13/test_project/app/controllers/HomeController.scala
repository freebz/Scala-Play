package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.MemberService

@Singleton
class HomeController @Inject()(ms : MemberService) extends Controller {

  def list = Action {
    Ok(views.html.list(ms.getList))
  }

}
