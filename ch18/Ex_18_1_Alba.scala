// 코드 18-1 기본 액터 모델 사용하기

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class Alba extends Actor {
  def receive = {
    case "Hey Alba!" => println("Yes?")
    case _ => println("Pardon?")
  }
}
