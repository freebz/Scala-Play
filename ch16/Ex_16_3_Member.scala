// 코드 16-3 models/Member (의존성 주입이 없는 코드)

import play.api.db.slick.DatabaseConfigProvider
import slick.driver.JdbcProfile

object Member {
  val db = DatabaseConfigProvider.get[JdbcProfile](Play.current).db
  def doSomething = {
    db.run( member.result ) //member.result는 회원전체를 가져오는 메서드라 가정.
  }
}
