// 코드 18-2 두 개의 액터 모델 사용하기

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

val actorSystem = ActorSystem("mySystem")
val lazyAlba = actorSystem.actorOf(Props[Alba], name = "alba_actor1")
val fastAlba = actorSystem.actorOf(Props[Alba], name = "alba_actor2")

lazyAlba ! "Hey Alba!"
fastAlba ! "hi"

class Alba extends Actor {
  def receive = {
    case "Hey Alba!" => Thread.sleep(1000) ; println("Yes?")
    case _ => println("Pardon?")
  }
}
