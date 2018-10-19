// 코드 18-10 암묵적 매개변수 맥락 설정

import akka.actor.ActorSystem
import akka.stream.Materializer

implicit val system = ActorSystem("MyActorSystem")
implicit val materializer = ActorMaterializer()
