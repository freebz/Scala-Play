// 코드 16-4 models/Member (의존성 주입이 있는 코드)

import play.api.db.slick.{DatabaseConfigProvider,HasDatabaseConfigProvider}
import javax.inject.{Inject, Singleton}
import slick.driver.JdbcProfile

@Singleton()
class MemberDataAccess @Inject()(protected val dbConfigProvider:
    DatabaseConfigProvider extends HasDatabaseConfigProvider[JdbcProfile]{
  def doSomething = {
    db.run( member.result ) // member.result는 회원 전체를 가져오는 메서드라 가정.
  }
}
