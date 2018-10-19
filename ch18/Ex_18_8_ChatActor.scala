// 코드 18-8 채팅 액터 클래스 및 객체 구현

class ChatActor(actorRef: ActorRef) extends Actor {
  def receive = {
    case str: String => {
      val json = Json.parse(str)
        (json \ "type").as[String] match {
          case "join"  => self ! Join((json \ "username").as[String])
          case "leave" => self ! Leave((json \ "username").as[String])
          case "talk" => self ! Talk((json \ "username").as[String],
            (json \ "msg").as[String])
        }
    }

    case Join(username) => {
      ChatActor.users = (username, actorRef) :: ChatActor.users
      actorRef ! ("채팅방에 입장하셨습니다.")
      broadcast(username + "께서 채팅에 참가하셨습니다.")
    }
    case Leave(username) => {
      ChatActor.users = ChatActor.users.filter(u => u._1 != username)
      broadcast(username + "께서 나가셨습니다.")
      actorRef ! ("채팅방에서 퇴장하였습니다.")
      actorRef ! PoisonPill
    }
    case Talk(username, msg) => {
      broadcast(username + ":" + msg)
    }
  }
  def broadcast(msg: String) = {
    ChatActor.users.foreach(u => u._2 ! msg)
  }
}

object ChatActor {
  var users = List[(String, ActorRef)]()  // 대화에 참여하는 user의 리스트
  def props(actor: ActorRef) = Props(new ChatActor(actor))
}
