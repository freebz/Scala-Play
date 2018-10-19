// 코드 18-9 액터 인스턴스화를 통한 연결 구현

def chat = WebSocket.accept[String, String] { request =>
  ActorFlow.actorRef(actor => ChatActor.props(actor))
}
