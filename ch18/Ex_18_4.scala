// 코드 18-4 서버 관련 웹 소켓 반응 코드

import akka.actor.Actor
import play.api.libs.iteratee._

def chatServer = Action { request =>
  Ok(views.html.chat(request))
}

def chat = WebSocket.using[String] { implicit request =>

  val in = Iteratee.foreach[String] { msgFromClient =>
    println(msgFromClient) }
  val out = Enumerator("Server To Client").andThen(Enumerator.oef)

  (in,out)
}
