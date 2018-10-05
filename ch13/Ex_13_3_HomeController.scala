// 코드 13-3 HomeController.scala

package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Member

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def list = Action {
    Ok(views.html.index(Member.getList))
  }

}
